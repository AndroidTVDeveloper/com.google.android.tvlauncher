package p000;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: rn */
/* compiled from: PG */
public final class C0475rn implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private final /* synthetic */ SeekBarPreference f10275a;

    public C0475rn(SeekBarPreference seekBarPreference) {
        this.f10275a = seekBarPreference;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.f10275a;
            if (seekBarPreference.f1390f || !seekBarPreference.f1387c) {
                seekBarPreference.mo1125a(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.f10275a;
        seekBarPreference2.mo1126e(i + seekBarPreference2.f1386b);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f10275a.f1387c = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f10275a.f1387c = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.f10275a;
        if (progress + seekBarPreference.f1386b != seekBarPreference.f1385a) {
            seekBarPreference.mo1125a(seekBar);
        }
    }
}
