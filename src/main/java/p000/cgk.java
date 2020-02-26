package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;

/* renamed from: cgk */
/* compiled from: PG */
public final class cgk extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ AddAppLinkActivity f5469a;

    public cgk(AddAppLinkActivity addAppLinkActivity) {
        this.f5469a = addAppLinkActivity;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f5469a.f6380d);
    }
}
