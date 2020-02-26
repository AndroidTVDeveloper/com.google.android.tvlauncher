package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.EditModeGridView;

/* renamed from: cgy */
/* compiled from: PG */
final /* synthetic */ class cgy implements cht {

    /* renamed from: a */
    private final chc f5493a;

    public cgy(chc chc) {
        this.f5493a = chc;
    }

    /* renamed from: a */
    public final void mo2782a(boolean z) {
        chc chc = this.f5493a;
        if (dcy.m6193b(chc.getContext()) && z) {
            EditModeGridView editModeGridView = chc.f5502a;
            Context context = editModeGridView.getContext();
            if (editModeGridView.f6411O == null) {
                editModeGridView.f6411O = new dad((Activity) context);
                editModeGridView.f6411O.mo4030a(new day(0, context.getString(R.string.accessibility_menu_item_move_up), context.getDrawable(R.drawable.ic_arrow_up_black_24dp)));
                editModeGridView.f6411O.mo4030a(new day(1, context.getString(R.string.accessibility_menu_item_move_down), context.getDrawable(R.drawable.ic_arrow_down_black_24dp)));
                day day = new day(2, context.getString(R.string.accessibility_menu_item_move_left), context.getDrawable(R.drawable.ic_arrow_left_black_24dp));
                day day2 = new day(3, context.getString(R.string.accessibility_menu_item_move_right), context.getDrawable(R.drawable.ic_arrow_right_black_24dp));
                if (dcy.m6191a(editModeGridView.getContext())) {
                    editModeGridView.f6411O.mo4030a(day2);
                    editModeGridView.f6411O.mo4030a(day);
                } else {
                    editModeGridView.f6411O.mo4030a(day);
                    editModeGridView.f6411O.mo4030a(day2);
                }
                editModeGridView.f6411O.mo4030a(new day(4, context.getString(R.string.accessibility_menu_item_done), context.getDrawable(R.drawable.ic_done_black_24dp)));
                editModeGridView.f6411O.f8022f = new chg(editModeGridView);
                editModeGridView.f6411O.f8023g = new chh(editModeGridView);
            }
            editModeGridView.mo3238v();
            editModeGridView.f6411O.mo4029a();
            return;
        }
        dad dad = chc.f5502a.f6411O;
        if (dad != null) {
            dad.mo4031b();
        }
    }
}
