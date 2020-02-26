package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;

/* renamed from: cgk  reason: default package */
/* compiled from: PG */
public final class cgk extends ViewOutlineProvider {
    private final /* synthetic */ AddAppLinkActivity a;

    public cgk(AddAppLinkActivity addAppLinkActivity) {
        this.a = addAppLinkActivity;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.a.d);
    }
}
