package p000;

import android.view.View;
import com.google.android.tvlauncher.appsview.EditModeGridView;

/* renamed from: chh */
/* compiled from: PG */
final class chh implements dau {

    /* renamed from: a */
    private final /* synthetic */ EditModeGridView f5528a;

    public chh(EditModeGridView editModeGridView) {
        this.f5528a = editModeGridView;
    }

    /* renamed from: a */
    public final void mo2803a() {
        View focusedChild = this.f5528a.getFocusedChild();
        if (focusedChild != null) {
            focusedChild.setSelected(false);
        }
    }
}
