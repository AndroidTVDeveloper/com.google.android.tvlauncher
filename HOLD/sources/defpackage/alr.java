package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;

/* renamed from: alr  reason: default package */
/* compiled from: PG */
public final class alr {
    private static final alr c = new alr(new int[]{2}, 8);
    private static final alr d = new alr(new int[]{2, 5, 6}, 8);
    public final int[] a;
    public final int b;

    private alr(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alr) {
            alr alr = (alr) obj;
            return Arrays.equals(this.a, alr.a) && this.b == alr.b;
        }
    }

    public static alr a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (blm.a >= 17 && "Amazon".equals(blm.c) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return d;
        }
        if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return c;
        }
        return new alr(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public final int hashCode() {
        return this.b + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        int i = this.b;
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
