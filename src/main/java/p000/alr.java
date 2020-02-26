package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;

/* renamed from: alr */
/* compiled from: PG */
public final class alr {

    /* renamed from: c */
    private static final alr f720c = new alr(new int[]{2}, 8);

    /* renamed from: d */
    private static final alr f721d = new alr(new int[]{2, 5, 6}, 8);

    /* renamed from: a */
    public final int[] f722a;

    /* renamed from: b */
    public final int f723b;

    private alr(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f722a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f722a = new int[0];
        }
        this.f723b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alr) {
            alr alr = (alr) obj;
            return Arrays.equals(this.f722a, alr.f722a) && this.f723b == alr.f723b;
        }
    }

    /* renamed from: a */
    public static alr m1041a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (blm.f4293a >= 17 && "Amazon".equals(blm.f4295c) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f721d;
        }
        if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f720c;
        }
        return new alr(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public final int hashCode() {
        return this.f723b + (Arrays.hashCode(this.f722a) * 31);
    }

    public final String toString() {
        int i = this.f723b;
        String arrays = Arrays.toString(this.f722a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
