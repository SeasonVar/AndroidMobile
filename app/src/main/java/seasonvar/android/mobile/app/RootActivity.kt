package seasonvar.android.mobile.app

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.FrameLayout
import androidx.navigation.fragment.NavHostFragment
import seasonvar.android.mobile.R

class RootActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            FrameLayout(this)
                .apply { id = android.R.id.content }
        )

        if (savedInstanceState == null) {
            val navigationHost = NavHostFragment.create(R.navigation.root)
            supportFragmentManager.beginTransaction()
                .add(android.R.id.content, navigationHost)
                .commit()
        }

    }

}
