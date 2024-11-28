package chat.services.Server.service.auth;
import chat.services.Server.model.Auth;
import chat.services.Server.model.AuthPrinciple;
import chat.services.Server.repository.AuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private AuthRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Auth user = repo.findByUserName(username);
        if(user==null){
            System.out.println("Not found!");
            throw new UsernameNotFoundException("User not found!");
        }

        return new AuthPrinciple(user);
    }
}
