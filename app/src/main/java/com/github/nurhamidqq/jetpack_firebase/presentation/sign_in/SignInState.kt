package com.github.nurhamidqq.jetpack_firebase.presentation.sign_in

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)