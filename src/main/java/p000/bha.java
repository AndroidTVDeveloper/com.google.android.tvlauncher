package p000;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.p003ui.SubtitleView;
import java.util.List;

/* renamed from: bha */
/* compiled from: PG */
final class bha implements View.OnLayoutChangeListener, aks, bds, bmb, bgy {

    /* renamed from: a */
    private final /* synthetic */ bhb f3916a;

    public /* synthetic */ bha(bhb bhb) {
        this.f3916a = bhb;
    }

    /* renamed from: a */
    public final void mo466a() {
    }

    /* renamed from: a */
    public final void mo467a(alh alh) {
        akr.m787a(this, alh);
    }

    /* renamed from: b */
    public final void mo468b() {
    }

    /* renamed from: c */
    public final void mo470c() {
    }

    /* renamed from: d */
    public final void mo471d() {
    }

    /* renamed from: e */
    public final void mo472e() {
    }

    /* renamed from: f */
    public final void mo473f() {
    }

    /* renamed from: g */
    public final void mo474g() {
    }

    /* renamed from: i */
    public final void mo476i() {
    }

    /* renamed from: j */
    public final void mo477j() {
    }

    /* renamed from: o */
    public final void mo569o() {
    }

    /* renamed from: a */
    public final void mo503a(List list) {
        SubtitleView subtitleView = this.f3916a.f3920d;
        if (subtitleView != null) {
            subtitleView.mo3176b(list);
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextureView textureView = (TextureView) view;
        textureView.getWidth();
        textureView.getHeight();
        textureView.setTransform(null);
    }

    /* renamed from: b */
    public final void mo469b(int i) {
        this.f3916a.mo1924c();
        this.f3916a.mo1925d();
        if (this.f3916a.mo1923b()) {
            bhb bhb = this.f3916a;
            if (bhb.f3923g) {
                bhb.mo1919a();
                return;
            }
        }
        this.f3916a.mo1921a(false);
    }

    /* renamed from: h */
    public final void mo475h() {
        if (this.f3916a.mo1923b()) {
            bhb bhb = this.f3916a;
            if (bhb.f3923g) {
                bhb.mo1919a();
            }
        }
    }

    /* renamed from: m */
    public final void mo567m() {
        View view = this.f3916a.f3918b;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: k */
    public final void mo478k() {
        this.f3916a.mo1922b(false);
    }

    /* renamed from: a */
    public final void mo495a(int i, int i2, int i3, float f) {
        float f2 = 1.0f;
        if (!(i2 == 0 || i == 0)) {
            f2 = (((float) i) * f) / ((float) i2);
        }
        bhb bhb = this.f3916a;
        bhb.m3235a(f2, bhb.f3917a, bhb.f3919c);
    }

    /* renamed from: l */
    public final void mo1896l() {
        this.f3916a.mo1927e();
    }
}
