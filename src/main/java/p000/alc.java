package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.List;

/* renamed from: alc */
/* compiled from: PG */
final class alc implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, bmk, amc, bds, aub, aiu, aks {

    /* renamed from: a */
    public final /* synthetic */ ald f643a;

    public /* synthetic */ alc(ald ald) {
        this.f643a = ald;
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

    /* renamed from: b */
    public final void mo469b(int i) {
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

    /* renamed from: h */
    public final void mo475h() {
    }

    /* renamed from: i */
    public final void mo476i() {
    }

    /* renamed from: j */
    public final void mo477j() {
    }

    /* renamed from: k */
    public final void mo478k() {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: a */
    public final void mo333a(int i) {
        ald ald = this.f643a;
        ald.mo521a(ald.mo394h(), i);
    }

    /* renamed from: b */
    public final void mo506b(String str, long j, long j2) {
        Iterator it = this.f643a.f651i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).mo506b(str, j, j2);
        }
    }

    /* renamed from: d */
    public final void mo509d(ani ani) {
        Iterator it = this.f643a.f651i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).mo509d(ani);
        }
        this.f643a.f658p = 0;
    }

    /* renamed from: c */
    public final void mo508c(ani ani) {
        Iterator it = this.f643a.f651i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).mo508c(ani);
        }
    }

    /* renamed from: b */
    public final void mo504b(akh akh) {
        Iterator it = this.f643a.f651i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).mo504b(akh);
        }
    }

    /* renamed from: c */
    public final void mo507c(int i) {
        ald ald = this.f643a;
        if (ald.f658p != i) {
            ald.f658p = i;
            Iterator it = ald.f647e.iterator();
            while (it.hasNext()) {
                als als = (als) it.next();
                if (!this.f643a.f651i.contains(als)) {
                    als.mo507c(i);
                }
            }
            Iterator it2 = this.f643a.f651i.iterator();
            while (it2.hasNext()) {
                ((amc) it2.next()).mo507c(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo497a(int i, long j, long j2) {
        Iterator it = this.f643a.f651i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).mo497a(i, j, j2);
        }
    }

    /* renamed from: a */
    public final void mo503a(List list) {
        ald ald = this.f643a;
        ald.f661s = list;
        Iterator it = ald.f648f.iterator();
        while (it.hasNext()) {
            ((bds) it.next()).mo503a(list);
        }
    }

    /* renamed from: a */
    public final void mo496a(int i, long j) {
        Iterator it = this.f643a.f650h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).mo496a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo501a(atw atw) {
        Iterator it = this.f643a.f649g.iterator();
        while (it.hasNext()) {
            ((aub) it.next()).mo501a(atw);
        }
    }

    /* renamed from: a */
    public final void mo499a(Surface surface) {
        ald ald = this.f643a;
        if (ald.f655m == surface) {
            Iterator it = ald.f646d.iterator();
            while (it.hasNext()) {
                ((bmb) it.next()).mo567m();
            }
        }
        Iterator it2 = this.f643a.f650h.iterator();
        while (it2.hasNext()) {
            ((bmk) it2.next()).mo499a(surface);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [android.view.Surface, int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f643a.mo518a(new Surface(surfaceTexture), true);
        this.f643a.mo517a(i, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f643a.mo518a((Surface) null, true);
        this.f643a.mo517a(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f643a.mo517a(i, i2);
    }

    /* renamed from: a */
    public final void mo502a(String str, long j, long j2) {
        Iterator it = this.f643a.f650h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).mo502a(str, j, j2);
        }
    }

    /* renamed from: b */
    public final void mo505b(ani ani) {
        Iterator it = this.f643a.f650h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).mo505b(ani);
        }
    }

    /* renamed from: a */
    public final void mo500a(ani ani) {
        Iterator it = this.f643a.f650h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).mo500a(ani);
        }
    }

    /* renamed from: a */
    public final void mo498a(akh akh) {
        Iterator it = this.f643a.f650h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).mo498a(akh);
        }
    }

    /* renamed from: a */
    public final void mo495a(int i, int i2, int i3, float f) {
        Iterator it = this.f643a.f646d.iterator();
        while (it.hasNext()) {
            bmb bmb = (bmb) it.next();
            if (!this.f643a.f650h.contains(bmb)) {
                bmb.mo495a(i, i2, i3, f);
            }
        }
        Iterator it2 = this.f643a.f650h.iterator();
        while (it2.hasNext()) {
            ((bmk) it2.next()).mo495a(i, i2, i3, f);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f643a.mo517a(i2, i3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [android.view.Surface, int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f643a.mo518a(surfaceHolder.getSurface(), false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f643a.mo518a((Surface) null, false);
        this.f643a.mo517a(0, 0);
    }
}
