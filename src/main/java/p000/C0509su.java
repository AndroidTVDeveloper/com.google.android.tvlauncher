package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: su */
/* compiled from: PG */
public final class C0509su extends agj implements Cloneable {

    /* renamed from: A */
    private C0513sy f10407A;

    /* renamed from: B */
    private Object f10408B;

    /* renamed from: C */
    private List f10409C;

    /* renamed from: D */
    private boolean f10410D = true;

    /* renamed from: E */
    private boolean f10411E;

    /* renamed from: F */
    private boolean f10412F;

    /* renamed from: a */
    public C0509su f10413a;

    /* renamed from: b */
    public C0509su f10414b;

    /* renamed from: w */
    private final Context f10415w;

    /* renamed from: x */
    private final C0512sx f10416x;

    /* renamed from: y */
    private final Class f10417y;

    /* renamed from: z */
    private final C0500sl f10418z;

    static {
        new agj((byte) 0).mo199a(C0594vy.f10650b).mo196a(C0501sm.LOW).mo211g();
    }

    protected C0509su(C0497si siVar, C0512sx sxVar, Class cls, Context context) {
        this.f10416x = sxVar;
        this.f10417y = cls;
        this.f10415w = context;
        C0500sl slVar = sxVar.f10423a.f10363b;
        C0513sy syVar = (C0513sy) slVar.f10386e.get(cls);
        if (syVar == null) {
            for (Map.Entry entry : slVar.f10386e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    syVar = (C0513sy) entry.getValue();
                }
            }
        }
        this.f10407A = syVar == null ? C0500sl.f10382a : syVar;
        this.f10418z = siVar.f10363b;
        for (agq agq : sxVar.f10425c) {
            if (agq != null) {
                if (this.f10409C == null) {
                    this.f10409C = new ArrayList();
                }
                this.f10409C.add(agq);
            }
        }
        mo202b(sxVar.mo5951f());
    }

    /* renamed from: a */
    public final C0509su mo202b(agj agj) {
        aic.m542a(agj);
        return (C0509su) super.mo202b(agj);
    }

    /* renamed from: a */
    private final agm m8312a(Object obj, ahg ahg, agq agq, ago ago, C0513sy syVar, C0501sm smVar, int i, int i2, agj agj, Executor executor) {
        agk agk;
        agk agk2;
        agt agt;
        int i3;
        int i4;
        C0501sm smVar2;
        int i5;
        int i6;
        C0501sm smVar3;
        Object obj2 = obj;
        agj agj2 = agj;
        if (this.f10414b != null) {
            agk2 = new agk(obj2, ago);
            agk = agk2;
        } else {
            agk = null;
            agk2 = ago;
        }
        C0509su suVar = this.f10413a;
        if (suVar == null) {
            agt = m8311a(obj, ahg, agq, agj, agk2, syVar, smVar, i, i2, executor);
        } else if (!this.f10412F) {
            C0513sy syVar2 = !suVar.f10410D ? suVar.f10407A : syVar;
            if (suVar.mo200a(8)) {
                smVar2 = this.f10413a.f274e;
            } else {
                int i7 = C0508st.f10406b[smVar.ordinal()];
                if (i7 == 1) {
                    smVar3 = C0501sm.NORMAL;
                } else if (i7 == 2) {
                    smVar3 = C0501sm.HIGH;
                } else if (i7 == 3 || i7 == 4) {
                    smVar3 = C0501sm.IMMEDIATE;
                } else {
                    String valueOf = String.valueOf(this.f274e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("unknown priority: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                smVar2 = smVar3;
            }
            C0509su suVar2 = this.f10413a;
            int i8 = suVar2.f280k;
            int i9 = suVar2.f279j;
            if (!aie.m560a(i, i2) || this.f10413a.mo208e()) {
                i5 = i9;
                i6 = i8;
            } else {
                i6 = agj2.f280k;
                i5 = agj2.f279j;
            }
            agt agt2 = new agt(obj2, agk2);
            Object obj3 = obj;
            ahg ahg2 = ahg;
            agq agq2 = agq;
            agt agt3 = agt2;
            agm a = m8311a(obj3, ahg2, agq2, agj, agt2, syVar, smVar, i, i2, executor);
            this.f10412F = true;
            C0509su suVar3 = this.f10413a;
            agm a2 = suVar3.m8312a(obj3, ahg2, agq2, agt3, syVar2, smVar2, i6, i5, suVar3, executor);
            this.f10412F = false;
            agt agt4 = agt3;
            agt4.f339a = a;
            agt4.f340b = a2;
            agt = agt4;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (agk == null) {
            return agt;
        }
        C0509su suVar4 = this.f10414b;
        int i10 = suVar4.f280k;
        int i11 = suVar4.f279j;
        if (!aie.m560a(i, i2) || this.f10414b.mo208e()) {
            i3 = i11;
            i4 = i10;
        } else {
            i4 = agj2.f280k;
            i3 = agj2.f279j;
        }
        C0509su suVar5 = this.f10414b;
        agm a3 = suVar5.m8312a(obj, ahg, agq, agk, suVar5.f10407A, suVar5.f274e, i4, i3, suVar5, executor);
        agk.f292a = agt;
        agk.f293b = a3;
        return agk;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C0509su clone() {
        C0509su suVar = (C0509su) super.clone();
        suVar.f10407A = suVar.f10407A.clone();
        return suVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5938a(android.widget.ImageView r4) {
        /*
            r3 = this;
            p000.aie.m559a()
            p000.aic.m542a(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = r3.mo200a(r0)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r3.f283n
            if (r0 == 0) goto L_0x005a
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L_0x005a
            int[] r0 = p000.C0508st.f10405a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x004a;
                case 2: goto L_0x0041;
                case 3: goto L_0x0031;
                case 4: goto L_0x0031;
                case 5: goto L_0x0031;
                case 6: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x005a
        L_0x0028:
            su r0 = r3.clone()
            agj r0 = r0.mo204c()
            goto L_0x005b
        L_0x0031:
            su r0 = r3.clone()
            acu r1 = p000.acu.f100b
            adc r2 = new adc
            r2.<init>()
            agj r0 = r0.mo201b(r1, r2)
            goto L_0x005b
        L_0x0041:
            su r0 = r3.clone()
            agj r0 = r0.mo204c()
            goto L_0x005b
        L_0x004a:
            su r0 = r3.clone()
            acu r1 = p000.acu.f102d
            aci r2 = new aci
            r2.<init>()
            agj r0 = r0.mo194a(r1, r2)
            goto L_0x005b
        L_0x005a:
            r0 = r3
        L_0x005b:
            java.lang.Class r1 = r3.f10417y
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x006b
            agv r1 = new agv
            r1.<init>(r4)
            goto L_0x007a
        L_0x006b:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L_0x0084
            aha r1 = new aha
            r1.<init>(r4)
        L_0x007a:
            r4 = 0
            java.util.concurrent.Executor r2 = p000.ahx.f387a
            ahg r4 = r3.mo5935a(r1, r4, r0, r2)
            ahj r4 = (p000.ahj) r4
            return
        L_0x0084:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 64
            r2.<init>(r1)
            java.lang.String r1 = "Unhandled class: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0509su.mo5938a(android.widget.ImageView):void");
    }

    /* renamed from: a */
    public final void mo5937a(ahg ahg) {
        mo5935a(ahg, null, this, ahx.f387a);
    }

    /* renamed from: a */
    public final ahg mo5935a(ahg ahg, agq agq, agj agj, Executor executor) {
        ahg ahg2 = ahg;
        agj agj2 = agj;
        aic.m542a(ahg);
        if (this.f10411E) {
            agm a = m8312a(new Object(), ahg, agq, (ago) null, this.f10407A, agj2.f274e, agj2.f280k, agj2.f279j, agj, executor);
            agm d = ahg.mo237d();
            if (!a.mo216a(d) || (!agj2.f278i && d.mo224e())) {
                this.f10416x.mo5947a(ahg);
                ahg.mo229a(a);
                this.f10416x.mo5948a(ahg, a);
                return ahg2;
            }
            if (!((agm) aic.m542a(d)).mo221d()) {
                d.mo215a();
            }
            return ahg2;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    public final void mo5939a(Object obj) {
        this.f10408B = obj;
        this.f10411E = true;
    }

    /* renamed from: a */
    private final agm m8311a(Object obj, ahg ahg, agq agq, agj agj, ago ago, C0513sy syVar, C0501sm smVar, int i, int i2, Executor executor) {
        Context context = this.f10415w;
        C0500sl slVar = this.f10418z;
        return new ags(context, slVar, obj, this.f10408B, this.f10417y, agj, i, i2, smVar, ahg, agq, this.f10409C, ago, slVar.f10387f, executor);
    }

    /* renamed from: b */
    public final void mo5940b() {
        mo5937a((ahg) new ahd(this.f10416x));
    }
}
