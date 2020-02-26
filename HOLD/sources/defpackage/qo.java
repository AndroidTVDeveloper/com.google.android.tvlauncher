package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* renamed from: qo  reason: default package */
/* compiled from: PG */
public final class qo implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public qo(Preference preference) {
        this.a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence f = this.a.f();
        if (this.a.x && !TextUtils.isEmpty(f)) {
            contextMenu.setHeaderTitle(f);
            contextMenu.add(0, 0, 0, (int) R.string.copy).setOnMenuItemClickListener(this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence f = this.a.f();
        ((ClipboardManager) this.a.j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", f));
        Context context = this.a.j;
        Toast.makeText(context, context.getString(R.string.preference_copied, f), 0).show();
        return true;
    }
}
