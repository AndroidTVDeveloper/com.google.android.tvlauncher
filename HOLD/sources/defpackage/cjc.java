package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cjc  reason: default package */
/* compiled from: PG */
public final class cjc {
    public static cjc a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final SharedPreferences d;
    public boolean e;
    private final cjb f;

    public cjc(Context context) {
        this.d = context.getSharedPreferences("com.google.android.tvlauncher.appsview.PREFERENCE_FILE_KEY", 0);
        this.f = new cjb(this);
        this.e = this.d.getBoolean("key_use_default_order", true);
    }

    public final void a(List list, SharedPreferences.Editor editor) {
        for (int i = 0; i < list.size(); i++) {
            String str = ((chn) list.get(i)).c;
            this.b.put(str, Integer.valueOf(i));
            editor.putInt(str, i);
        }
    }

    public final void a(SharedPreferences.Editor editor, List list, int i) {
        if (list != null && !list.isEmpty() && this.e) {
            int i2 = 0;
            while (i2 < list.size() && i2 < i) {
                this.c.put((String) list.get(i2), Integer.valueOf(i2));
                i2++;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                editor.putInt((String) list.get(i3), i3);
            }
        }
    }

    public final void a(List list) {
        a();
        Collections.sort(list, this.f);
    }

    public final void a() {
        if (this.b.isEmpty()) {
            Map<String, ?> all = this.d.getAll();
            for (String next : all.keySet()) {
                if (!TextUtils.equals(next, "key_use_default_order") && (all.get(next) instanceof Integer)) {
                    this.b.put(next, (Integer) all.get(next));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(List list) {
        SharedPreferences.Editor edit = this.d.edit();
        a(list, edit);
        edit.apply();
    }

    public final void c(List list) {
        SharedPreferences.Editor edit = this.d.edit();
        edit.clear();
        edit.putBoolean("key_use_default_order", false);
        this.e = false;
        this.b.clear();
        a(list, edit);
        edit.apply();
    }
}
