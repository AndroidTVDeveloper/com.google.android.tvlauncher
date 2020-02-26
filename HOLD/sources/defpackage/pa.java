package defpackage;

import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;

/* renamed from: pa  reason: default package */
/* compiled from: PG */
public final class pa implements Runnable {
    private final /* synthetic */ DatePicker a;

    public pa(DatePicker datePicker) {
        this.a = datePicker;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        DatePicker datePicker = this.a;
        int[] iArr = {datePicker.b, datePicker.a, datePicker.c};
        boolean z4 = true;
        boolean z5 = true;
        for (int length = DatePicker.g.length - 1; length >= 0; length--) {
            if (iArr[length] >= 0) {
                int i = DatePicker.g[length];
                pf a2 = datePicker.a(iArr[length]);
                if (z5) {
                    z = DatePicker.a(a2, datePicker.d.get(i));
                } else {
                    z = DatePicker.a(a2, datePicker.f.getActualMinimum(i));
                }
                if (!z4) {
                    z2 = z | DatePicker.b(a2, datePicker.f.getActualMaximum(i));
                } else {
                    z2 = z | DatePicker.b(a2, datePicker.e.get(i));
                }
                z5 &= datePicker.f.get(i) == datePicker.d.get(i);
                if (datePicker.f.get(i) == datePicker.e.get(i)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 &= z3;
                if (z2) {
                    datePicker.a(iArr[length], a2);
                }
                int i2 = iArr[length];
                int i3 = datePicker.f.get(i);
                pf pfVar = (pf) datePicker.j.get(i2);
                if (pfVar.a != i3) {
                    pfVar.a = i3;
                    VerticalGridView verticalGridView = (VerticalGridView) datePicker.i.get(i2);
                    if (verticalGridView != null) {
                        verticalGridView.i(i3 - ((pf) datePicker.j.get(i2)).b);
                    }
                }
            }
        }
    }
}
