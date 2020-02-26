package defpackage;

import android.view.View;
import com.google.android.tvlauncher.appsview.EditModeGridView;

/* renamed from: chh  reason: default package */
/* compiled from: PG */
final class chh implements dau {
    private final /* synthetic */ EditModeGridView a;

    public chh(EditModeGridView editModeGridView) {
        this.a = editModeGridView;
    }

    public final void a() {
        View focusedChild = this.a.getFocusedChild();
        if (focusedChild != null) {
            focusedChild.setSelected(false);
        }
    }
}
