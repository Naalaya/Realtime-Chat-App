package chat.services.Server.controller.user;

import chat.services.Server.model.Profile;
import chat.services.Server.service.profile.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/profile")
public class UserController {
    @Autowired
    private IProfileService ProfileSrv;

    // Add Profile (user Information)
    @GetMapping("/add")
    public Profile addProfile(@RequestBody Profile profile) {
        return ProfileSrv.addUserProfile(profile);
    }

    // update Profile (user Information)
    @PutMapping("update")
    public Profile updateProfile(@RequestParam("id") long id, @RequestBody Profile profile) {
        return ProfileSrv.updateUserProfile(id, profile);
    }

    // Delete Profile (user Information)
    @DeleteMapping("delete/{id}")
    public boolean deleteProfile(@PathVariable("id") long id) {
        return ProfileSrv.deleteUserProfile(id);
    }

    // Get all user
    @GetMapping("/list")
    public List<Profile> listProfiles() {
        return ProfileSrv.getAllUserProfile();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable("id") long id) {
        return ProfileSrv.getUserProfile(id);
    }
}