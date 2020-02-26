package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.List;

/* renamed from: alc  reason: default package */
/* compiled from: PG */
final class alc implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, bmk, amc, bds, aub, aiu, aks {
    public final /* synthetic */ ald a;

    public /* synthetic */ alc(ald ald) {
        this.a = ald;
    }

    public final void a() {
    }

    public final void a(alh alh) {
        akr.a(this, alh);
    }

    public final void b() {
    }

    public final void b(int i) {
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

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void a(int i) {
        ald ald = this.a;
        ald.a(ald.h(), i);
    }

    public final void b(String str, long j, long j2) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).b(str, j, j2);
        }
    }

    public final void d(ani ani) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).d(ani);
        }
        this.a.p = 0;
    }

    public final void c(ani ani) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).c(ani);
        }
    }

    public final void b(akh akh) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).b(akh);
        }
    }

    public final void c(int i) {
        ald ald = this.a;
        if (ald.p != i) {
            ald.p = i;
            Iterator it = ald.e.iterator();
            while (it.hasNext()) {
                als als = (als) it.next();
                if (!this.a.i.contains(als)) {
                    als.c(i);
                }
            }
            Iterator it2 = this.a.i.iterator();
            while (it2.hasNext()) {
                ((amc) it2.next()).c(i);
            }
        }
    }

    public final void a(int i, long j, long j2) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((amc) it.next()).a(i, j, j2);
        }
    }

    public final void a(List list) {
        ald ald = this.a;
        ald.s = list;
        Iterator it = ald.f.iterator();
        while (it.hasNext()) {
            ((bds) it.next()).a(list);
        }
    }

    public final void a(int i, long j) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).a(i, j);
        }
    }

    public final void a(atw atw) {
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((aub) it.next()).a(atw);
        }
    }

    public final void a(Surface surface) {
        ald ald = this.a;
        if (ald.m == surface) {
            Iterator it = ald.d.iterator();
            while (it.hasNext()) {
                ((bmb) it.next()).m();
            }
        }
        Iterator it2 = this.a.h.iterator();
        while (it2.hasNext()) {
            ((bmk) it2.next()).a(surface);
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
        this.a.a(new Surface(surfaceTexture), true);
        this.a.a(i, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.a((Surface) null, true);
        this.a.a(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.a(i, i2);
    }

    public final void a(String str, long j, long j2) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).a(str, j, j2);
        }
    }

    public final void b(ani ani) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).b(ani);
        }
    }

    public final void a(ani ani) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).a(ani);
        }
    }

    public final void a(akh akh) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((bmk) it.next()).a(akh);
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            bmb bmb = (bmb) it.next();
            if (!this.a.h.contains(bmb)) {
                bmb.a(i, i2, i3, f);
            }
        }
        Iterator it2 = this.a.h.iterator();
        while (it2.hasNext()) {
            ((bmk) it2.next()).a(i, i2, i3, f);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.a(i2, i3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [android.view.Surface, int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.a(surfaceHolder.getSurface(), false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.a((Surface) null, false);
        this.a.a(0, 0);
    }
}
