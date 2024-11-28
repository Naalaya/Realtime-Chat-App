//package chat.services.Server.service.profile;
//
//import chat.services.Server.model.Profile;
//import chat.services.Server.repository.ProfileRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class IProfileServiceImpl implements IProfileService {
//    @Autowired
//    private ProfileRepo profileRepo;
//
//    @Override
//    public Profile addUserProfile(Profile profile) {
//            return profileRepo.save(profile);
//    }
//
//    @Override
//    public Profile updateUserProfile(long id, Profile Profile) {
//        if(!profileRepo.existsById(id)) {
//            Profile profile = profileRepo.getById(id);
//            profile.setName(Profile.getName());
//            profile.setAddress(Profile.getAddress());
//
//            return profileRepo.save(profile);
//        }
//        return null;
//    }
//
//    @Override
//    public boolean deleteUserProfile(long id) {
//        if(id>=0){
//            Profile profile = profileRepo.getById(id);
//            profileRepo.delete(profile);
//            return true;
//
//        }
//        return false;
//    }
//
//    @Override
//    public Profile getUserProfile(long id) {
//        return profileRepo.getById(id);
//    }
//
//    @Override
//    public List<Profile> getAllUserProfile() {
//        return profileRepo.findAll();
//    }
//}
