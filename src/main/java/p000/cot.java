package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.settings.AppChannelPermissionActivity;

/* renamed from: cot */
/* compiled from: PG */
final /* synthetic */ class cot implements View.OnClickListener {

    /* renamed from: a */
    public static final View.OnClickListener f6839a = new cot();

    private cot() {
    }

    public final void onClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), AppChannelPermissionActivity.class));
    }
}
