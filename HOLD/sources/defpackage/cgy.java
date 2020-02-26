package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.EditModeGridView;

/* renamed from: cgy  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cgy implements cht {
    private final chc a;

    public cgy(chc chc) {
        this.a = chc;
    }

    public final void a(boolean z) {
        chc chc = this.a;
        if (dcy.b(chc.getContext()) && z) {
            EditModeGridView editModeGridView = chc.a;
            Context context = editModeGridView.getContext();
            if (editModeGridView.O == null) {
                editModeGridView.O = new dad((Activity) context);
                editModeGridView.O.a(new day(0, context.getString(R.string.accessibility_menu_item_move_up), context.getDrawable(R.drawable.ic_arrow_up_black_24dp)));
                editModeGridView.O.a(new day(1, context.getString(R.string.accessibility_menu_item_move_down), context.getDrawable(R.drawable.ic_arrow_down_black_24dp)));
                day day = new day(2, context.getString(R.string.accessibility_menu_item_move_left), context.getDrawable(R.drawable.ic_arrow_left_black_24dp));
                day day2 = new day(3, context.getString(R.string.accessibility_menu_item_move_right), context.getDrawable(R.drawable.ic_arrow_right_black_24dp));
                if (dcy.a(editModeGridView.getContext())) {
                    editModeGridView.O.a(day2);
                    editModeGridView.O.a(day);
                } else {
                    editModeGridView.O.a(day);
                    editModeGridView.O.a(day2);
                }
                editModeGridView.O.a(new day(4, context.getString(R.string.accessibility_menu_item_done), context.getDrawable(R.drawable.ic_done_black_24dp)));
                editModeGridView.O.f = new chg(editModeGridView);
                editModeGridView.O.g = new chh(editModeGridView);
            }
            editModeGridView.v();
            editModeGridView.O.a();
            return;
        }
        dad dad = chc.a.O;
        if (dad != null) {
            dad.b();
        }
    }
}
