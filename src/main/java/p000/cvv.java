package p000;

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

/* renamed from: cvv */
/* compiled from: PG */
public final class cvv extends C0334mh implements cvw, C0448qn {

    /* renamed from: h */
    public Context f7700h;

    /* renamed from: i */
    public String f7701i = null;

    /* renamed from: j */
    private cfr f7702j;

    /* renamed from: k */
    private cvt f7703k;

    /* renamed from: l */
    private final Map f7704l = new HashMap(5);

    /* renamed from: m */
    private final List f7705m = new ArrayList(20);

    /* renamed from: n */
    private final cvu f7706n = new cvu(this);

    /* renamed from: o */
    private boolean f7707o;

    /* renamed from: p */
    private final cvj f7708p = new cvs(this);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo3839f() {
        this.f7706n.removeMessages(2);
    }

    /* renamed from: g */
    private final void m5761g() {
        List list;
        if (this.f7705m.size() != 0) {
            String str = null;
            if (!(getActivity() == null || getActivity().getIntent() == null)) {
                str = getActivity().getIntent().getStringExtra("input_group_id");
            }
            if (str == null) {
                list = this.f7705m;
            } else if (this.f7704l.containsKey(str)) {
                list = (List) this.f7704l.get(str);
            } else {
                return;
            }
            String str2 = this.f7701i;
            if (str2 == null && str == null) {
                m5760a((String) list.get(0));
                return;
            }
            if (str2 == null) {
                m5760a((String) list.get(0));
            } else {
                int indexOf = list.indexOf(str2);
                if (indexOf >= 0) {
                    m5760a((String) list.get((indexOf + 1) % list.size()));
                } else {
                    m5760a((String) list.get(0));
                }
            }
            if (list.size() == 1) {
                m5758a(2000);
            } else {
                m5758a(3000);
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
            this.f7703k = cvt;
            cvt.mo3422a(this);
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
    /* renamed from: a */
    public final void mo3836a(Bundle bundle) {
        C0470ri riVar = this.f10224b;
        PreferenceScreen a = riVar.mo5809a(riVar.f10247a);
        Context context = getContext();
        this.f7700h = context;
        a.mo1094b((CharSequence) dck.m6123a(context).mo4093b(this.f7700h));
        mo5792a(a);
        this.f7702j = new cfr(this);
        cfs cfs = new cfs(33, 0);
        if (cfs.f5422e == null) {
            cfs.f5422e = dmq.f8858b.mo4516l();
        }
        dja dja = cfs.f5422e;
        for (int i = 0; i < cvm.m5749a(this.f7700h).mo3810d(); i++) {
            dja l = dmp.f8854d.mo4516l();
            m5759a(l, i);
            if (dja.f8673b) {
                dja.mo4505b();
                dja.f8673b = false;
            }
            dmq dmq = (dmq) dja.f8672a;
            dmp dmp = (dmp) l.mo4509g();
            dmq dmq2 = dmq.f8858b;
            dmp.getClass();
            if (!dmq.f8859a.mo4374a()) {
                dmq.f8859a = dje.m6690a(dmq.f8859a);
            }
            dmq.f8859a.add(dmp);
        }
        this.f7702j.mo2714a(cfs);
    }

    /* renamed from: e */
    public final void mo3838e() {
        PreferenceScreen b = mo5793b();
        boolean z = dck.m6123a(this.f7700h).f8228e.f8275j;
        cvl a = cvm.m5749a(this.f7700h);
        b.mo1123s();
        this.f7704l.clear();
        this.f7705m.clear();
        for (int i = 0; i < a.mo3810d(); i++) {
            cvk cvk = new cvk(this.f10224b.f10247a, this.f7708p);
            if (a.mo3815h(i) == null) {
                cvk.mo1084a(a.mo3814g(i));
            } else {
                Uri h = a.mo3815h(i);
                Uri i2 = a.mo3816i(i);
                a.mo3818k(i);
                a.mo3819l(i);
                if (i2 == null) {
                    i2 = h;
                }
                cvk.f7681c = h;
                cvk.f7682d = i2;
            }
            cvk.mo1094b((CharSequence) a.mo3812e(i));
            cvk.mo1078a((CharSequence) a.mo3813f(i));
            cvk.f7679a = a.mo3808c(i);
            String num = Integer.toString(i);
            if (!a.mo3805b(i).equals("com.google.android.tvlauncher.input.home")) {
                cvk.f7680b = z;
            } else {
                cvk.f7680b = true;
            }
            cvk.mo1098c(num);
            cvk.f1361o = this;
            b.mo1117a((Preference) cvk);
            String j = a.mo3817j(i);
            if (j != null) {
                if (this.f7704l.containsKey(j)) {
                    ((List) this.f7704l.get(j)).add(num);
                } else {
                    ArrayList arrayList = new ArrayList(5);
                    arrayList.add(num);
                    this.f7704l.put(j, arrayList);
                }
            }
            this.f7705m.add(num);
        }
        if (!this.f7707o) {
            this.f7707o = true;
            m5761g();
        }
    }

    public final void onPause() {
        super.onPause();
        cvm.m5749a(this.f7700h).mo3807b(this);
        mo3839f();
    }

    /* renamed from: a */
    public final boolean mo3837a(Preference preference) {
        String str = preference.f1365s;
        if (str == null) {
            return super.mo4019b(preference);
        }
        int intValue = Integer.valueOf(str).intValue();
        cfs cfs = new cfs(34, (byte) 0);
        cfs.mo2729b(dhs.f8549m);
        cfs.mo2724a(intValue);
        if (cfs.f5421d == null) {
            cfs.f5421d = dmp.f8854d.mo4516l();
        }
        m5759a(cfs.f5421d, intValue);
        this.f7702j.mo2714a(cfs);
        mo3839f();
        cvt cvt = this.f7703k;
        if (cvt == null) {
            return true;
        }
        cvt.mo3421a(intValue);
        return true;
    }

    public final void onResume() {
        super.onResume();
        cvm.m5749a(this.f7700h).mo3804a(this);
        cvm.m5749a(this.f7700h).mo3806b();
        if (this.f7707o) {
            m5761g();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m5759a(p000.dja r11, int r12) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f7700h
            cvl r0 = p000.cvm.m5749a(r0)
            int r0 = r0.mo3811d(r12)
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
            boolean r1 = r11.f8673b
            if (r1 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r11.mo4505b()
            r11.f8673b = r8
        L_0x0067:
            dje r1 = r11.f8672a
            dmp r1 = (p000.dmp) r1
            dmp r4 = p000.dmp.f8854d
            r1.f8856b = r0
            int r0 = r1.f8855a
            r0 = r0 | r3
            r1.f8855a = r0
        L_0x0074:
            android.content.Context r0 = r10.f7700h
            cvl r0 = p000.cvm.m5749a(r0)
            java.lang.String r12 = r0.mo3812e(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x009f
            boolean r0 = r11.f8673b
            if (r0 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r11.mo4505b()
            r11.f8673b = r8
        L_0x008e:
            dje r11 = r11.f8672a
            dmp r11 = (p000.dmp) r11
            dmp r0 = p000.dmp.f8854d
            r12.getClass()
            int r0 = r11.f8855a
            r0 = r0 | r2
            r11.f8855a = r0
            r11.f8857c = r12
            return
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cvv.m5759a(dja, int):void");
    }

    /* renamed from: a */
    private final void m5760a(String str) {
        this.f7701i = str;
        this.f7706n.sendEmptyMessage(3);
    }

    /* renamed from: a */
    private final void m5758a(int i) {
        this.f7706n.removeMessages(2);
        this.f7706n.sendEmptyMessageDelayed(2, (long) i);
    }
}
