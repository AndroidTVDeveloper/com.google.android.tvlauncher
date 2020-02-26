package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cvv  reason: default package */
/* compiled from: PG */
public final class cvv extends mh implements cvw, qn {
    public Context h;
    public String i = null;
    private cfr j;
    private cvt k;
    private final Map l = new HashMap(5);
    private final List m = new ArrayList(20);
    private final cvu n = new cvu(this);
    private boolean o;
    private final cvj p = new cvs(this);

    /* access modifiers changed from: package-private */
    public final void f() {
        this.n.removeMessages(2);
    }

    private final void g() {
        List list;
        if (this.m.size() != 0) {
            String str = null;
            if (!(getActivity() == null || getActivity().getIntent() == null)) {
                str = getActivity().getIntent().getStringExtra("input_group_id");
            }
            if (str == null) {
                list = this.m;
            } else if (this.l.containsKey(str)) {
                list = (List) this.l.get(str);
            } else {
                return;
            }
            String str2 = this.i;
            if (str2 == null && str == null) {
                a((String) list.get(0));
                return;
            }
            if (str2 == null) {
                a((String) list.get(0));
            } else {
                int indexOf = list.indexOf(str2);
                if (indexOf >= 0) {
                    a((String) list.get((indexOf + 1) % list.size()));
                } else {
                    a((String) list.get(0));
                }
            }
            if (list.size() == 1) {
                a(2000);
            } else {
                a(3000);
            }
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (activity instanceof cvt) {
            cvt cvt = (cvt) activity;
            this.k = cvt;
            cvt.a(this);
            return;
        }
        Log.e("InputsPanelFragment", "onAttach: parent activity is of wrong type");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void a(Bundle bundle) {
        ri riVar = this.b;
        PreferenceScreen a = riVar.a(riVar.a);
        Context context = getContext();
        this.h = context;
        a.b((CharSequence) dck.a(context).b(this.h));
        a(a);
        this.j = new cfr(this);
        cfs cfs = new cfs(33, 0);
        if (cfs.e == null) {
            cfs.e = dmq.b.l();
        }
        dja dja = cfs.e;
        for (int i2 = 0; i2 < cvm.a(this.h).d(); i2++) {
            dja l2 = dmp.d.l();
            a(l2, i2);
            if (dja.b) {
                dja.b();
                dja.b = false;
            }
            dmq dmq = (dmq) dja.a;
            dmp dmp = (dmp) l2.g();
            dmq dmq2 = dmq.b;
            dmp.getClass();
            if (!dmq.a.a()) {
                dmq.a = dje.a(dmq.a);
            }
            dmq.a.add(dmp);
        }
        this.j.a(cfs);
    }

    public final void e() {
        PreferenceScreen b = b();
        boolean z = dck.a(this.h).e.j;
        cvl a = cvm.a(this.h);
        b.s();
        this.l.clear();
        this.m.clear();
        for (int i2 = 0; i2 < a.d(); i2++) {
            cvk cvk = new cvk(this.b.a, this.p);
            if (a.h(i2) == null) {
                cvk.a(a.g(i2));
            } else {
                Uri h2 = a.h(i2);
                Uri i3 = a.i(i2);
                a.k(i2);
                a.l(i2);
                if (i3 == null) {
                    i3 = h2;
                }
                cvk.c = h2;
                cvk.d = i3;
            }
            cvk.b((CharSequence) a.e(i2));
            cvk.a((CharSequence) a.f(i2));
            cvk.a = a.c(i2);
            String num = Integer.toString(i2);
            if (!a.b(i2).equals("com.google.android.tvlauncher.input.home")) {
                cvk.b = z;
            } else {
                cvk.b = true;
            }
            cvk.c(num);
            cvk.o = this;
            b.a((Preference) cvk);
            String j2 = a.j(i2);
            if (j2 != null) {
                if (this.l.containsKey(j2)) {
                    ((List) this.l.get(j2)).add(num);
                } else {
                    ArrayList arrayList = new ArrayList(5);
                    arrayList.add(num);
                    this.l.put(j2, arrayList);
                }
            }
            this.m.add(num);
        }
        if (!this.o) {
            this.o = true;
            g();
        }
    }

    public final void onPause() {
        super.onPause();
        cvm.a(this.h).b(this);
        f();
    }

    public final boolean a(Preference preference) {
        String str = preference.s;
        if (str == null) {
            return super.b(preference);
        }
        int intValue = Integer.valueOf(str).intValue();
        cfs cfs = new cfs(34, (byte) 0);
        cfs.b(dhs.m);
        cfs.a(intValue);
        if (cfs.d == null) {
            cfs.d = dmp.d.l();
        }
        a(cfs.d, intValue);
        this.j.a(cfs);
        f();
        cvt cvt = this.k;
        if (cvt == null) {
            return true;
        }
        cvt.a(intValue);
        return true;
    }

    public final void onResume() {
        super.onResume();
        cvm.a(this.h).a(this);
        cvm.a(this.h).b();
        if (this.o) {
            g();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.dja r11, int r12) {
        /*
            r10 = this;
            android.content.Context r0 = r10.h
            cvl r0 = defpackage.cvm.a(r0)
            int r0 = r0.d(r12)
            r1 = -10
            r2 = 2
            r3 = 1
            r4 = -3
            r5 = -4
            r6 = -5
            r7 = -6
            r8 = 0
            r9 = -2
            if (r0 == r1) goto L_0x0057
            r1 = -9
            if (r0 == r1) goto L_0x0057
            r1 = -8
            if (r0 == r1) goto L_0x0057
            if (r0 == r7) goto L_0x0053
            if (r0 == r6) goto L_0x004f
            if (r0 == r5) goto L_0x004b
            if (r0 == r4) goto L_0x0047
            if (r0 == r9) goto L_0x0057
            if (r0 == 0) goto L_0x0043
            switch(r0) {
                case 1001: goto L_0x003f;
                case 1002: goto L_0x003c;
                case 1003: goto L_0x003a;
                case 1004: goto L_0x0038;
                case 1005: goto L_0x0036;
                case 1006: goto L_0x0034;
                case 1007: goto L_0x0031;
                case 1008: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = 0
            goto L_0x005a
        L_0x002e:
            r0 = 9
            goto L_0x003d
        L_0x0031:
            r0 = 8
            goto L_0x003d
        L_0x0034:
            r0 = 7
            goto L_0x003d
        L_0x0036:
            r0 = 6
            goto L_0x003d
        L_0x0038:
            r0 = 5
            goto L_0x003d
        L_0x003a:
            r0 = 4
            goto L_0x003d
        L_0x003c:
            r0 = 3
        L_0x003d:
            goto L_0x005a
        L_0x003f:
            r0 = 2
            goto L_0x005a
        L_0x0043:
            r0 = 1
            goto L_0x005a
        L_0x0047:
            r0 = -3
            goto L_0x005a
        L_0x004b:
            r0 = -4
            goto L_0x005a
        L_0x004f:
            r0 = -5
            goto L_0x005a
        L_0x0053:
            r0 = -6
            goto L_0x005a
        L_0x0057:
            r0 = -2
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            goto L_0x0074
        L_0x005d:
            boolean r1 = r11.b
            if (r1 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r11.b()
            r11.b = r8
        L_0x0067:
            dje r1 = r11.a
            dmp r1 = (defpackage.dmp) r1
            dmp r4 = defpackage.dmp.d
            r1.b = r0
            int r0 = r1.a
            r0 = r0 | r3
            r1.a = r0
        L_0x0074:
            android.content.Context r0 = r10.h
            cvl r0 = defpackage.cvm.a(r0)
            java.lang.String r12 = r0.e(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x009f
            boolean r0 = r11.b
            if (r0 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r11.b()
            r11.b = r8
        L_0x008e:
            dje r11 = r11.a
            dmp r11 = (defpackage.dmp) r11
            dmp r0 = defpackage.dmp.d
            r12.getClass()
            int r0 = r11.a
            r0 = r0 | r2
            r11.a = r0
            r11.c = r12
            return
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvv.a(dja, int):void");
    }

    private final void a(String str) {
        this.i = str;
        this.n.sendEmptyMessage(3);
    }

    private final void a(int i2) {
        this.n.removeMessages(2);
        this.n.sendEmptyMessageDelayed(2, (long) i2);
    }
}
