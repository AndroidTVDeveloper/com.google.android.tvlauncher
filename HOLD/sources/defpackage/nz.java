package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: nz  reason: default package */
/* compiled from: PG */
final class nz {
    private static final Rect a = new Rect();

    static int a(View view, nx nxVar, int i) {
        View view2;
        int i2;
        int i3;
        int i4;
        int i5;
        np npVar = (np) view.getLayoutParams();
        int i6 = nxVar.a;
        if (i6 == 0 || (view2 = view.findViewById(i6)) == null) {
            view2 = view;
        }
        int i7 = nxVar.b;
        if (i != 0) {
            if (nxVar.c != -1.0f) {
                i7 += (int) ((((float) (view2 == view ? (view2.getHeight() - npVar.f) - npVar.h : view2.getHeight())) * nxVar.c) / 100.0f);
            }
            if (view != view2) {
                a.top = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, a);
                return a.top - npVar.f;
            }
        } else if (view.getLayoutDirection() != 1) {
            if (nxVar.c != -1.0f) {
                if (view2 != view) {
                    i5 = view2.getWidth();
                } else {
                    i5 = npVar.a(view2);
                }
                i7 += (int) ((((float) i5) * nxVar.c) / 100.0f);
            }
            if (view != view2) {
                a.left = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, a);
                return a.left - npVar.e;
            }
        } else {
            if (view2 != view) {
                i3 = view2.getWidth();
            } else {
                i3 = npVar.a(view2);
            }
            int i8 = i3 - i7;
            if (nxVar.c == -1.0f) {
                i2 = i8;
            } else {
                if (view2 != view) {
                    i4 = view2.getWidth();
                } else {
                    i4 = npVar.a(view2);
                }
                i2 = i8 - ((int) ((((float) i4) * nxVar.c) / 100.0f));
            }
            if (view2 != view) {
                a.right = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, a);
                return a.right + npVar.g;
            }
        }
        return i2;
    }
}
