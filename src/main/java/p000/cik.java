package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.StoreRowButtonView;

/* renamed from: cik */
/* compiled from: PG */
public final class cik extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ StoreRowButtonView f5645a;

    public cik(StoreRowButtonView storeRowButtonView) {
        this.f5645a = storeRowButtonView;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, this.f5645a.getWidth(), this.f5645a.getHeight(), (float) this.f5645a.f6420b);
    }
}
