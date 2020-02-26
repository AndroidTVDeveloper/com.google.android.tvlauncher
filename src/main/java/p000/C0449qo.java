package p000;

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

/* renamed from: qo */
/* compiled from: PG */
public final class C0449qo implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final Preference f10208a;

    public C0449qo(Preference preference) {
        this.f10208a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence f = this.f10208a.mo1080f();
        if (this.f10208a.f1370x && !TextUtils.isEmpty(f)) {
            contextMenu.setHeaderTitle(f);
            contextMenu.add(0, 0, 0, (int) R.string.copy).setOnMenuItemClickListener(this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence f = this.f10208a.mo1080f();
        ((ClipboardManager) this.f10208a.f1356j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", f));
        Context context = this.f10208a.f1356j;
        Toast.makeText(context, context.getString(R.string.preference_copied, f), 0).show();
        return true;
    }
}
