package p000;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: ro */
/* compiled from: PG */
public final class C0476ro implements View.OnKeyListener {

    /* renamed from: a */
    private final /* synthetic */ SeekBarPreference f10276a;

    public C0476ro(SeekBarPreference seekBarPreference) {
        this.f10276a = seekBarPreference;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.f10276a;
            if (!((!seekBarPreference.f1389e && (i == 21 || i == 22)) || i == 23 || i == 66)) {
                SeekBar seekBar = seekBarPreference.f1388d;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
