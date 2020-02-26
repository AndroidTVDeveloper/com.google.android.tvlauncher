package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cjc */
/* compiled from: PG */
public final class cjc {

    /* renamed from: a */
    public static cjc f5698a;

    /* renamed from: b */
    public final HashMap f5699b = new HashMap();

    /* renamed from: c */
    public final HashMap f5700c = new HashMap();

    /* renamed from: d */
    public final SharedPreferences f5701d;

    /* renamed from: e */
    public boolean f5702e;

    /* renamed from: f */
    private final cjb f5703f;

    public cjc(Context context) {
        this.f5701d = context.getSharedPreferences("com.google.android.tvlauncher.appsview.PREFERENCE_FILE_KEY", 0);
        this.f5703f = new cjb(this);
        this.f5702e = this.f5701d.getBoolean("key_use_default_order", true);
    }

    /* renamed from: a */
    public final void mo2910a(List list, SharedPreferences.Editor editor) {
        for (int i = 0; i < list.size(); i++) {
            String str = ((chn) list.get(i)).f5563c;
            this.f5699b.put(str, Integer.valueOf(i));
            editor.putInt(str, i);
        }
    }

    /* renamed from: a */
    public final void mo2908a(SharedPreferences.Editor editor, List list, int i) {
        if (list != null && !list.isEmpty() && this.f5702e) {
            int i2 = 0;
            while (i2 < list.size() && i2 < i) {
                this.f5700c.put((String) list.get(i2), Integer.valueOf(i2));
                i2++;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                editor.putInt((String) list.get(i3), i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo2909a(List list) {
        mo2907a();
        Collections.sort(list, this.f5703f);
    }

    /* renamed from: a */
    public final void mo2907a() {
        if (this.f5699b.isEmpty()) {
            Map<String, ?> all = this.f5701d.getAll();
            for (String next : all.keySet()) {
                if (!TextUtils.equals(next, "key_use_default_order") && (all.get(next) instanceof Integer)) {
                    this.f5699b.put(next, (Integer) all.get(next));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2911b(List list) {
        SharedPreferences.Editor edit = this.f5701d.edit();
        mo2910a(list, edit);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo2912c(List list) {
        SharedPreferences.Editor edit = this.f5701d.edit();
        edit.clear();
        edit.putBoolean("key_use_default_order", false);
        this.f5702e = false;
        this.f5699b.clear();
        mo2910a(list, edit);
        edit.apply();
    }
}
