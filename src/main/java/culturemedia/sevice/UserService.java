package culturemedia.sevice;

import culturemedia.dto.ApiResponse;
import culturemedia.dto.LoginDto;
import culturemedia.dto.SignUpDto;

public interface UserService {

    ApiResponse signUp(SignUpDto signUpDto);

    ApiResponse login(LoginDto loginDto);
}
