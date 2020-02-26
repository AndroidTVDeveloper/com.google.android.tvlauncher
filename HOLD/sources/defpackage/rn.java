package defpackage;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: rn  reason: default package */
/* compiled from: PG */
public final class rn implements SeekBar.OnSeekBarChangeListener {
    private final /* synthetic */ SeekBarPreference a;

    public rn(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.a;
            if (seekBarPreference.f || !seekBarPreference.c) {
                seekBarPreference.a(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.a;
        seekBarPreference2.e(i + seekBarPreference2.b);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.c = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.a;
        if (progress + seekBarPreference.b != seekBarPreference.a) {
            seekBarPreference.a(seekBar);
        }
    }
}
