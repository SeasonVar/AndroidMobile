package seasonvar.android.mobile.presentation.common

import android.databinding.BindingAdapter
import android.view.View

@BindingAdapter("visibleOrInvisibleIf")
fun View.visibleOrInvisibleIf(condition: Boolean) {
    visibility = if (condition) View.VISIBLE else View.INVISIBLE
}
