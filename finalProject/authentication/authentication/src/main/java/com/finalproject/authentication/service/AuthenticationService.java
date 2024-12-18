package com.finalproject.authentication.service;

import com.finalproject.authentication.dto.JWTResponseDTO;
import com.finalproject.authentication.dto.RefreshTokenDTO;
import com.finalproject.authentication.dto.SignInDTO;
import com.finalproject.authentication.exception.BadCredentialsException;
import com.finalproject.authentication.exception.RefreshTokenNotValid;
import com.finalproject.authentication.exception.RefreshTokenStillValidException;
import com.finalproject.authentication.model.UserCredentials;


public interface AuthenticationService {

    JWTResponseDTO signIn(SignInDTO signInDTO) throws BadCredentialsException;

    String[] getRoles(UserCredentials userCredentials);

    JWTResponseDTO refreshToken(RefreshTokenDTO refreshTokenDTO) throws RefreshTokenStillValidException,
            RefreshTokenNotValid;

}
