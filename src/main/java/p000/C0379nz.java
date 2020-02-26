package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: nz */
/* compiled from: PG */
final class C0379nz {

    /* renamed from: a */
    private static final Rect f10067a = new Rect();

    /* renamed from: a */
    static int m8128a(View view, C0377nx nxVar, int i) {
        View view2;
        int i2;
        int i3;
        int i4;
        int i5;
        C0369np npVar = (C0369np) view.getLayoutParams();
        int i6 = nxVar.f10063a;
        if (i6 == 0 || (view2 = view.findViewById(i6)) == null) {
            view2 = view;
        }
        int i7 = nxVar.f10064b;
        if (i != 0) {
            if (nxVar.f10065c != -1.0f) {
                i7 += (int) ((((float) (view2 == view ? (view2.getHeight() - npVar.f10006f) - npVar.f10008h : view2.getHeight())) * nxVar.f10065c) / 100.0f);
            }
            if (view != view2) {
                f10067a.top = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, f10067a);
                return f10067a.top - npVar.f10006f;
            }
        } else if (view.getLayoutDirection() != 1) {
            if (nxVar.f10065c != -1.0f) {
                if (view2 != view) {
                    i5 = view2.getWidth();
                } else {
                    i5 = npVar.mo5654a(view2);
                }
                i7 += (int) ((((float) i5) * nxVar.f10065c) / 100.0f);
            }
            if (view != view2) {
                f10067a.left = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, f10067a);
                return f10067a.left - npVar.f10005e;
            }
        } else {
            if (view2 != view) {
                i3 = view2.getWidth();
            } else {
                i3 = npVar.mo5654a(view2);
            }
            int i8 = i3 - i7;
            if (nxVar.f10065c == -1.0f) {
                i2 = i8;
            } else {
                if (view2 != view) {
                    i4 = view2.getWidth();
                } else {
                    i4 = npVar.mo5654a(view2);
                }
                i2 = i8 - ((int) ((((float) i4) * nxVar.f10065c) / 100.0f));
            }
            if (view2 != view) {
                f10067a.right = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, f10067a);
                return f10067a.right + npVar.f10007g;
            }
        }
        return i2;
    }
}
