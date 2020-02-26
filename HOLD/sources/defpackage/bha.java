package defpackage;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.List;

/* renamed from: bha  reason: default package */
/* compiled from: PG */
final class bha implements View.OnLayoutChangeListener, aks, bds, bmb, bgy {
    private final /* synthetic */ bhb a;

    public /* synthetic */ bha(bhb bhb) {
        this.a = bhb;
    }

    public final void a() {
    }

    public final void a(alh alh) {
        akr.a(this, alh);
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final void o() {
    }

    public final void a(List list) {
        SubtitleView subtitleView = this.a.d;
        if (subtitleView != null) {
            subtitleView.b(list);
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextureView textureView = (TextureView) view;
        textureView.getWidth();
        textureView.getHeight();
        textureView.setTransform(null);
    }

    public final void b(int i) {
        this.a.c();
        this.a.d();
        if (this.a.b()) {
            bhb bhb = this.a;
            if (bhb.g) {
                bhb.a();
                return;
            }
        }
        this.a.a(false);
    }

    public final void h() {
        if (this.a.b()) {
            bhb bhb = this.a;
            if (bhb.g) {
                bhb.a();
            }
        }
    }

    public final void m() {
        View view = this.a.b;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public final void k() {
        this.a.b(false);
    }

    public final void a(int i, int i2, int i3, float f) {
        float f2 = 1.0f;
        if (!(i2 == 0 || i == 0)) {
            f2 = (((float) i) * f) / ((float) i2);
        }
        bhb bhb = this.a;
        bhb.a(f2, bhb.a, bhb.c);
    }

    public final void l() {
        this.a.e();
    }
}
