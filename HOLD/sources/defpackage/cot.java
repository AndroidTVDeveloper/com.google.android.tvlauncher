package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.settings.AppChannelPermissionActivity;

/* renamed from: cot  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cot implements View.OnClickListener {
    public static final View.OnClickListener a = new cot();

    private cot() {
    }

    public final void onClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), AppChannelPermissionActivity.class));
    }
}
