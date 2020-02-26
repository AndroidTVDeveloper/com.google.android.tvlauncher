package p000;

import com.google.android.tvlauncher.appsview.EditModeGridView;

/* renamed from: chg */
/* compiled from: PG */
final class chg implements dav {

    /* renamed from: a */
    private final /* synthetic */ EditModeGridView f5527a;

    public chg(EditModeGridView editModeGridView) {
        this.f5527a = editModeGridView;
    }

    /* renamed from: a */
    public final void mo2802a(day day) {
        int i = day.f8117a;
        if (i == 0) {
            EditModeGridView editModeGridView = this.f5527a;
            editModeGridView.mo3236a(editModeGridView.getFocusedChild(), 33);
        } else if (i == 1) {
            EditModeGridView editModeGridView2 = this.f5527a;
            editModeGridView2.mo3236a(editModeGridView2.getFocusedChild(), 130);
        } else if (i == 2) {
            EditModeGridView editModeGridView3 = this.f5527a;
            editModeGridView3.mo3236a(editModeGridView3.getFocusedChild(), 17);
        } else if (i != 3) {
            this.f5527a.f6411O.mo4031b();
        } else {
            EditModeGridView editModeGridView4 = this.f5527a;
            editModeGridView4.mo3236a(editModeGridView4.getFocusedChild(), 66);
        }
    }
}
