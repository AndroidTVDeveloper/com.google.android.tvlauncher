package defpackage;

import com.google.android.tvlauncher.appsview.EditModeGridView;

/* renamed from: chg  reason: default package */
/* compiled from: PG */
final class chg implements dav {
    private final /* synthetic */ EditModeGridView a;

    public chg(EditModeGridView editModeGridView) {
        this.a = editModeGridView;
    }

    public final void a(day day) {
        int i = day.a;
        if (i == 0) {
            EditModeGridView editModeGridView = this.a;
            editModeGridView.a(editModeGridView.getFocusedChild(), 33);
        } else if (i == 1) {
            EditModeGridView editModeGridView2 = this.a;
            editModeGridView2.a(editModeGridView2.getFocusedChild(), 130);
        } else if (i == 2) {
            EditModeGridView editModeGridView3 = this.a;
            editModeGridView3.a(editModeGridView3.getFocusedChild(), 17);
        } else if (i != 3) {
            this.a.O.b();
        } else {
            EditModeGridView editModeGridView4 = this.a;
            editModeGridView4.a(editModeGridView4.getFocusedChild(), 66);
        }
    }
}
