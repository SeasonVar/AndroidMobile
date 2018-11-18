package seasonvar.android.mobile.presentation.login

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import seasonvar.android.mobile.presentation.login.databinding.LoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: LoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = LoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.model = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        binding.handler = object : LoginViewHandler {
            override fun onLoginButtonClick() = binding.model!!.login()
        }

    }

}
