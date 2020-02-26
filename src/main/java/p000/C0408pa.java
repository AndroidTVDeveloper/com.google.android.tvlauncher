package p000;

import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;

/* renamed from: pa */
/* compiled from: PG */
public final class C0408pa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ DatePicker f10115a;

    public C0408pa(DatePicker datePicker) {
        this.f10115a = datePicker;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        DatePicker datePicker = this.f10115a;
        int[] iArr = {datePicker.f1302b, datePicker.f1301a, datePicker.f1303c};
        boolean z4 = true;
        boolean z5 = true;
        for (int length = DatePicker.f1300g.length - 1; length >= 0; length--) {
            if (iArr[length] >= 0) {
                int i = DatePicker.f1300g[length];
                C0413pf a = datePicker.mo5733a(iArr[length]);
                if (z5) {
                    z = DatePicker.m1441a(a, datePicker.f1304d.get(i));
                } else {
                    z = DatePicker.m1441a(a, datePicker.f1306f.getActualMinimum(i));
                }
                if (!z4) {
                    z2 = z | DatePicker.m1443b(a, datePicker.f1306f.getActualMaximum(i));
                } else {
                    z2 = z | DatePicker.m1443b(a, datePicker.f1305e.get(i));
                }
                z5 &= datePicker.f1306f.get(i) == datePicker.f1304d.get(i);
                if (datePicker.f1306f.get(i) == datePicker.f1305e.get(i)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 &= z3;
                if (z2) {
                    datePicker.mo5734a(iArr[length], a);
                }
                int i2 = iArr[length];
                int i3 = datePicker.f1306f.get(i);
                C0413pf pfVar = (C0413pf) datePicker.f10131j.get(i2);
                if (pfVar.f10137a != i3) {
                    pfVar.f10137a = i3;
                    VerticalGridView verticalGridView = (VerticalGridView) datePicker.f10130i.get(i2);
                    if (verticalGridView != null) {
                        verticalGridView.mo5617i(i3 - ((C0413pf) datePicker.f10131j.get(i2)).f10138b);
                    }
                }
            }
        }
    }
}
