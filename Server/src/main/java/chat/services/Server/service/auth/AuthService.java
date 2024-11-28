package chat.services.Server.service.auth;

import chat.services.Server.DTO.SignUpRequest;
import chat.services.Server.model.Auth;
import chat.services.Server.model.User;
import chat.services.Server.repository.AuthRepo;
import chat.services.Server.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {
    @Autowired
    public AuthRepo authRepo;

    @Autowired
    public UsersRepo usersRepo;

    @Autowired
    private JWTService jwtService;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Autowired
    AuthenticationManager authManager;

    @Transactional
    public String register(SignUpRequest request) {
        if (authRepo.findByUserName(request.getUsername()) != null){
            throw new IllegalArgumentException("Username already exists!"); // check if the user already exists in the db
        }

        Auth auth = new Auth();
        auth.setPassword(encoder.encode(request.getPassword()));
        auth.setUsername(request.getUsername());

        User user = new User();
        user.setImage(request.getImage());
        user.setName(request.getName());
        user.setAddress(request.getAddress());

        authRepo.save(auth); // store username, password in auth table
        usersRepo.save(user); // store user details in users table

        return "Successfully register new user!";
    }

    public String verify(Auth user) {
        Authentication authentication =
                authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        if (authentication.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        return "Fail to verify!";
    }

}
