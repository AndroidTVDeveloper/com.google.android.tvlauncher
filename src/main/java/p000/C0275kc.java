package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kc */
/* compiled from: PG */
public final class C0275kc {

    /* renamed from: a */
    public final ArrayList f9726a = new ArrayList();

    /* renamed from: b */
    public ArrayList f9727b = null;

    /* renamed from: c */
    public final ArrayList f9728c = new ArrayList();

    /* renamed from: d */
    public final List f9729d = Collections.unmodifiableList(this.f9726a);

    /* renamed from: e */
    public int f9730e = 2;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f9731f;

    /* renamed from: g */
    private int f9732g = 2;

    /* renamed from: h */
    private C0274kb f9733h;

    public C0275kc(RecyclerView recyclerView) {
        this.f9731f = recyclerView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5396a(C0285km kmVar, boolean z) {
        RecyclerView.m1300b(kmVar);
        View view = kmVar.f9783a;
        C0287ko koVar = this.f9731f.f1029I;
        if (koVar != null) {
            C0093dj b = koVar.mo5456b();
            C0107dx.m7200a(view, b instanceof C0286kn ? (C0093dj) ((C0286kn) b).f9801b.remove(view) : null);
        }
        if (z) {
            if (!(this.f9731f.f1069i == null || kmVar.mo5436d() == -1)) {
                View view2 = kmVar.f9783a;
            }
            C0261jp jpVar = this.f9731f.f1067g;
            if (jpVar != null) {
                jpVar.mo2853a(kmVar);
            }
            RecyclerView recyclerView = this.f9731f;
            if (recyclerView.f1024D != null) {
                recyclerView.f1064d.mo5539d(kmVar);
            }
        }
        kmVar.f9797o = null;
        C0274kb d = mo5403d();
        int i = kmVar.f9788f;
        ArrayList arrayList = d.mo5390a(i).f9721a;
        C0273ka kaVar = (C0273ka) d.f9724a.get(i);
        if (arrayList.size() < 5) {
            kmVar.mo5451r();
            arrayList.add(kmVar);
        }
    }

    /* renamed from: a */
    public final void mo5393a() {
        this.f9726a.clear();
        mo5401c();
    }

    /* renamed from: d */
    public final C0274kb mo5403d() {
        if (this.f9733h == null) {
            this.f9733h = new C0274kb();
        }
        return this.f9733h;
    }

    /* renamed from: a */
    public final View mo5391a(int i) {
        return mo5392a(i, Long.MAX_VALUE).f9783a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5399b(View view) {
        C0285km c = RecyclerView.m1301c(view);
        c.f9793k = null;
        c.f9794l = false;
        c.mo5440h();
        mo5395a(c);
    }

    /* renamed from: c */
    public final void mo5401c() {
        for (int size = this.f9728c.size() - 1; size >= 0; size--) {
            mo5398b(size);
        }
        this.f9728c.clear();
        Interpolator interpolator = RecyclerView.f1018K;
        this.f9731f.f1023C.mo5260a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kc.a(km, boolean):void
     arg types: [km, int]
     candidates:
      kc.a(int, long):km
      kc.a(km, boolean):void */
    /* renamed from: b */
    public final void mo5398b(int i) {
        mo5396a((C0285km) this.f9728c.get(i), true);
        this.f9728c.remove(i);
    }

    /* renamed from: a */
    public final void mo5394a(View view) {
        C0285km c = RecyclerView.m1301c(view);
        if (c.mo5446n()) {
            this.f9731f.removeDetachedView(view, false);
        }
        if (c.mo5437e()) {
            c.mo5438f();
        } else if (c.mo5439g()) {
            c.mo5440h();
        }
        mo5395a(c);
        if (this.f9731f.f1084x != null && !c.mo5452s()) {
            this.f9731f.f1084x.mo4194c(c);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kc.a(km, boolean):void
     arg types: [km, int]
     candidates:
      kc.a(int, long):km
      kc.a(km, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5395a(C0285km kmVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (kmVar.mo5437e() || kmVar.f9783a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(kmVar.mo5437e());
            sb.append(" isAttached:");
            if (kmVar.f9783a.getParent() == null) {
                z3 = false;
            }
            sb.append(z3);
            sb.append(this.f9731f.mo822a());
            throw new IllegalArgumentException(sb.toString());
        } else if (kmVar.mo5446n()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + kmVar + this.f9731f.mo822a());
        } else if (!kmVar.mo5434b()) {
            if ((kmVar.f9792j & 16) != 0 || !C0107dx.m7206c(kmVar.f9783a)) {
                z = false;
            } else {
                z = true;
            }
            C0261jp jpVar = this.f9731f.f1067g;
            if (jpVar != null && z) {
                jpVar.mo3596c(kmVar);
            }
            if (!kmVar.mo5452s()) {
                z2 = false;
            } else {
                if (this.f9732g <= 0 || kmVar.mo5448o(526)) {
                    z2 = false;
                } else {
                    int size = this.f9728c.size();
                    if (size >= this.f9732g && size > 0) {
                        mo5398b(0);
                        size--;
                    }
                    if (size > 0 && !this.f9731f.f1023C.mo5263a(kmVar.f9785c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!this.f9731f.f1023C.mo5263a(((C0285km) this.f9728c.get(i)).f9785c)) {
                                break;
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                    this.f9728c.add(size, kmVar);
                    z2 = true;
                }
                if (!z2) {
                    mo5396a(kmVar, true);
                    z4 = true;
                }
            }
            this.f9731f.f1064d.mo5539d(kmVar);
            if (!z2 && !z4 && z) {
                kmVar.f9797o = null;
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.f9731f.mo822a());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: km.a(kc, boolean):void
     arg types: [kc, int]
     candidates:
      km.a(int, int):void
      km.a(int, boolean):void
      km.a(kc, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo5402c(View view) {
        C0266ju juVar;
        C0285km c = RecyclerView.m1301c(view);
        if (!c.mo5448o(12) && c.mo5453t() && (juVar = this.f9731f.f1084x) != null && !juVar.mo4216a(c, c.mo5450q())) {
            if (this.f9727b == null) {
                this.f9727b = new ArrayList();
            }
            c.mo5431a(this, true);
            this.f9727b.add(c);
        } else if (!c.mo5442j() || c.mo5445m() || this.f9731f.f1067g.f9698a) {
            c.mo5431a(this, false);
            this.f9726a.add(c);
        } else {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.f9731f.mo822a());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0209, code lost:
        if (r10.f9787e != r8.mo2835b(r10.f9785c)) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x047d, code lost:
        if ((r11 + r7) < r20) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d0, code lost:
        if (r1.f9731f.f1024D.f9765g != false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0285km mo5392a(int r19, long r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            if (r0 < 0) goto L_0x0562
            android.support.v7.widget.RecyclerView r2 = r1.f9731f
            kk r2 = r2.f1024D
            int r2 = r2.mo5420a()
            if (r0 >= r2) goto L_0x0562
            android.support.v7.widget.RecyclerView r2 = r1.f9731f
            kk r2 = r2.f1024D
            boolean r2 = r2.f9765g
            r3 = 32
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0093
            java.util.ArrayList r2 = r1.f9727b
            if (r2 == 0) goto L_0x008b
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0027
            goto L_0x008b
        L_0x0027:
            r7 = 0
        L_0x0028:
            if (r7 >= r2) goto L_0x0047
            java.util.ArrayList r8 = r1.f9727b
            java.lang.Object r8 = r8.get(r7)
            km r8 = (p000.C0285km) r8
            boolean r9 = r8.mo5439g()
            if (r9 == 0) goto L_0x0039
        L_0x0038:
            goto L_0x0044
        L_0x0039:
            int r9 = r8.mo5435c()
            if (r9 != r0) goto L_0x0038
            r8.mo5433b(r3)
            goto L_0x008c
        L_0x0044:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x0047:
            android.support.v7.widget.RecyclerView r7 = r1.f9731f
            jp r8 = r7.f1067g
            boolean r8 = r8.f9698a
            if (r8 == 0) goto L_0x008b
            gw r7 = r7.f1062b
            int r7 = r7.mo5087b(r0)
            if (r7 <= 0) goto L_0x008b
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            jp r8 = r8.f1067g
            int r8 = r8.mo2794a()
            if (r7 >= r8) goto L_0x008b
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            jp r8 = r8.f1067g
            long r7 = r8.mo2835b(r7)
            r9 = 0
        L_0x006a:
            if (r9 >= r2) goto L_0x008a
            java.util.ArrayList r10 = r1.f9727b
            java.lang.Object r10 = r10.get(r9)
            km r10 = (p000.C0285km) r10
            boolean r11 = r10.mo5439g()
            if (r11 == 0) goto L_0x007b
        L_0x007a:
            goto L_0x0087
        L_0x007b:
            long r11 = r10.f9787e
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x007a
            r10.mo5433b(r3)
            r8 = r10
            goto L_0x008c
        L_0x0087:
            int r9 = r9 + 1
            goto L_0x006a
        L_0x008a:
        L_0x008b:
            r8 = r6
        L_0x008c:
            if (r8 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0096
        L_0x0090:
            r2 = 0
            goto L_0x0096
        L_0x0093:
            r8 = r6
            r2 = 0
        L_0x0096:
            r7 = -1
            if (r8 != 0) goto L_0x0254
            java.util.ArrayList r8 = r1.f9726a
            int r9 = r8.size()
            r8 = 0
        L_0x00a0:
            if (r8 < r9) goto L_0x0191
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            ho r8 = r8.f1063c
            java.util.List r9 = r8.f9493c
            int r9 = r9.size()
            r10 = 0
        L_0x00ad:
            if (r10 >= r9) goto L_0x00d2
            java.util.List r11 = r8.f9493c
            java.lang.Object r11 = r11.get(r10)
            android.view.View r11 = (android.view.View) r11
            km r12 = android.support.p002v7.widget.RecyclerView.m1301c(r11)
            int r13 = r12.mo5435c()
            if (r13 == r0) goto L_0x00c2
            goto L_0x00cf
        L_0x00c2:
            boolean r13 = r12.mo5442j()
            if (r13 != 0) goto L_0x00cf
            boolean r12 = r12.mo5445m()
            if (r12 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            int r10 = r10 + 1
            goto L_0x00ad
        L_0x00d2:
            r11 = r6
        L_0x00d4:
            if (r11 == 0) goto L_0x0160
            km r8 = android.support.p002v7.widget.RecyclerView.m1301c(r11)
            android.support.v7.widget.RecyclerView r9 = r1.f9731f
            ho r9 = r9.f1063c
            hn r10 = r9.f9491a
            int r10 = r10.mo5192a(r11)
            if (r10 < 0) goto L_0x0149
            hm r12 = r9.f9492b
            boolean r12 = r12.mo5187c(r10)
            if (r12 == 0) goto L_0x0132
            hm r12 = r9.f9492b
            r12.mo5186b(r10)
            r9.mo5207d(r11)
            android.support.v7.widget.RecyclerView r9 = r1.f9731f
            ho r9 = r9.f1063c
            int r9 = r9.mo5202b(r11)
            if (r9 == r7) goto L_0x0112
            android.support.v7.widget.RecyclerView r10 = r1.f9731f
            ho r10 = r10.f1063c
            r10.mo5206d(r9)
            r1.mo5402c(r11)
            r9 = 8224(0x2020, float:1.1524E-41)
            r8.mo5433b(r9)
            r10 = r8
            goto L_0x01c0
        L_0x0112:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.append(r3)
            r2.append(r8)
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            java.lang.String r3 = r3.mo822a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0132:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0149:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0160:
            java.util.ArrayList r8 = r1.f9728c
            int r8 = r8.size()
            r9 = 0
        L_0x0167:
            if (r9 >= r8) goto L_0x018e
            java.util.ArrayList r10 = r1.f9728c
            java.lang.Object r10 = r10.get(r9)
            km r10 = (p000.C0285km) r10
            boolean r11 = r10.mo5442j()
            if (r11 == 0) goto L_0x0178
        L_0x0177:
            goto L_0x018b
        L_0x0178:
            int r11 = r10.mo5435c()
            if (r11 != r0) goto L_0x0177
            boolean r11 = r10.mo5447o()
            if (r11 != 0) goto L_0x018b
            java.util.ArrayList r8 = r1.f9728c
            r8.remove(r9)
            goto L_0x01c0
        L_0x018b:
            int r9 = r9 + 1
            goto L_0x0167
        L_0x018e:
            r10 = r6
            goto L_0x01c0
        L_0x0191:
            java.util.ArrayList r10 = r1.f9726a
            java.lang.Object r10 = r10.get(r8)
            km r10 = (p000.C0285km) r10
            boolean r11 = r10.mo5439g()
            if (r11 == 0) goto L_0x01a1
        L_0x019f:
            goto L_0x0250
        L_0x01a1:
            int r11 = r10.mo5435c()
            if (r11 != r0) goto L_0x019f
            boolean r11 = r10.mo5442j()
            if (r11 != 0) goto L_0x0250
            android.support.v7.widget.RecyclerView r11 = r1.f9731f
            kk r11 = r11.f1024D
            boolean r11 = r11.f9765g
            if (r11 != 0) goto L_0x01bb
            boolean r11 = r10.mo5445m()
            if (r11 != 0) goto L_0x0250
        L_0x01bb:
            r10.mo5433b(r3)
        L_0x01c0:
            if (r10 != 0) goto L_0x01c4
            goto L_0x0255
        L_0x01c4:
            boolean r8 = r10.mo5445m()
            if (r8 == 0) goto L_0x01d5
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            kk r8 = r8.f1024D
            boolean r8 = r8.f9765g
            if (r8 == 0) goto L_0x020c
        L_0x01d2:
            r2 = 1
            goto L_0x0255
        L_0x01d5:
            int r8 = r10.f9785c
            if (r8 < 0) goto L_0x0230
            android.support.v7.widget.RecyclerView r9 = r1.f9731f
            jp r9 = r9.f1067g
            int r9 = r9.mo2794a()
            if (r8 >= r9) goto L_0x0230
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            kk r9 = r8.f1024D
            boolean r9 = r9.f9765g
            if (r9 != 0) goto L_0x01f7
            jp r8 = r8.f1067g
            int r9 = r10.f9785c
            int r8 = r8.mo2850a(r9)
            int r9 = r10.f9788f
            if (r8 != r9) goto L_0x020c
        L_0x01f7:
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            jp r8 = r8.f1067g
            boolean r9 = r8.f9698a
            if (r9 == 0) goto L_0x01d2
            long r11 = r10.f9787e
            int r9 = r10.f9785c
            long r8 = r8.mo2835b(r9)
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x020c
            goto L_0x01d2
        L_0x020c:
            r8 = 4
            r10.mo5433b(r8)
            boolean r8 = r10.mo5437e()
            if (r8 == 0) goto L_0x0221
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            android.view.View r9 = r10.f9783a
            r8.removeDetachedView(r9, r4)
            r10.mo5438f()
            goto L_0x022a
        L_0x0221:
            boolean r8 = r10.mo5439g()
            if (r8 == 0) goto L_0x022a
            r10.mo5440h()
        L_0x022a:
            r1.mo5395a(r10)
            r10 = r6
            goto L_0x0255
        L_0x0230:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.append(r3)
            r2.append(r10)
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            java.lang.String r3 = r3.mo822a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0250:
            int r8 = r8 + 1
            goto L_0x00a0
        L_0x0254:
            r10 = r8
        L_0x0255:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 != 0) goto L_0x03f3
            android.support.v7.widget.RecyclerView r13 = r1.f9731f
            gw r13 = r13.f1062b
            int r13 = r13.mo5087b(r0)
            if (r13 < 0) goto L_0x03bb
            android.support.v7.widget.RecyclerView r14 = r1.f9731f
            jp r14 = r14.f1067g
            int r14 = r14.mo2794a()
            if (r13 >= r14) goto L_0x03bb
            android.support.v7.widget.RecyclerView r14 = r1.f9731f
            jp r14 = r14.f1067g
            int r14 = r14.mo2850a(r13)
            android.support.v7.widget.RecyclerView r15 = r1.f9731f
            jp r15 = r15.f1067g
            boolean r5 = r15.f9698a
            if (r5 == 0) goto L_0x030f
            long r16 = r15.mo2835b(r13)
            java.util.ArrayList r5 = r1.f9726a
            int r5 = r5.size()
            int r5 = r5 + r7
        L_0x028b:
            if (r5 < 0) goto L_0x02d4
            java.util.ArrayList r10 = r1.f9726a
            java.lang.Object r10 = r10.get(r5)
            km r10 = (p000.C0285km) r10
            long r8 = r10.f9787e
            int r15 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x029c
            goto L_0x02d1
        L_0x029c:
            boolean r8 = r10.mo5439g()
            if (r8 != 0) goto L_0x02d1
            int r8 = r10.f9788f
            if (r14 == r8) goto L_0x02b8
            java.util.ArrayList r8 = r1.f9726a
            r8.remove(r5)
            android.support.v7.widget.RecyclerView r8 = r1.f9731f
            android.view.View r9 = r10.f9783a
            r8.removeDetachedView(r9, r4)
            android.view.View r8 = r10.f9783a
            r1.mo5399b(r8)
            goto L_0x02d1
        L_0x02b8:
            r10.mo5433b(r3)
            boolean r3 = r10.mo5445m()
            if (r3 == 0) goto L_0x02d0
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            kk r3 = r3.f1024D
            boolean r3 = r3.f9765g
            if (r3 != 0) goto L_0x02d0
            r3 = 2
            r5 = 14
            r10.mo5428a(r3, r5)
        L_0x02d0:
            goto L_0x0309
        L_0x02d1:
            int r5 = r5 + -1
            goto L_0x028b
        L_0x02d4:
            java.util.ArrayList r3 = r1.f9728c
            int r3 = r3.size()
            int r3 = r3 + r7
        L_0x02db:
            if (r3 < 0) goto L_0x0307
            java.util.ArrayList r5 = r1.f9728c
            java.lang.Object r5 = r5.get(r3)
            km r5 = (p000.C0285km) r5
            long r8 = r5.f9787e
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 == 0) goto L_0x02ec
            goto L_0x0304
        L_0x02ec:
            boolean r8 = r5.mo5447o()
            if (r8 != 0) goto L_0x0304
            int r8 = r5.f9788f
            if (r14 != r8) goto L_0x02fe
            java.util.ArrayList r8 = r1.f9728c
            r8.remove(r3)
            r10 = r5
            goto L_0x0309
        L_0x02fe:
            r1.mo5398b(r3)
            r10 = r6
            goto L_0x0309
        L_0x0304:
            int r3 = r3 + -1
            goto L_0x02db
        L_0x0307:
            r10 = r6
        L_0x0309:
            if (r10 == 0) goto L_0x030f
            r10.f9785c = r13
            r2 = 1
            goto L_0x0310
        L_0x030f:
        L_0x0310:
            if (r10 != 0) goto L_0x0350
            kb r3 = r18.mo5403d()
            android.util.SparseArray r3 = r3.f9724a
            java.lang.Object r3 = r3.get(r14)
            ka r3 = (p000.C0273ka) r3
            if (r3 == 0) goto L_0x0348
            java.util.ArrayList r5 = r3.f9721a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0348
            java.util.ArrayList r3 = r3.f9721a
            int r5 = r3.size()
            int r5 = r5 + r7
        L_0x032f:
            if (r5 < 0) goto L_0x0347
            java.lang.Object r7 = r3.get(r5)
            km r7 = (p000.C0285km) r7
            boolean r7 = r7.mo5447o()
            if (r7 != 0) goto L_0x0344
            java.lang.Object r3 = r3.remove(r5)
            km r3 = (p000.C0285km) r3
            goto L_0x0349
        L_0x0344:
            int r5 = r5 + -1
            goto L_0x032f
        L_0x0347:
        L_0x0348:
            r3 = r6
        L_0x0349:
            if (r3 == 0) goto L_0x034e
            r3.mo5451r()
        L_0x034e:
            r10 = r3
            goto L_0x0351
        L_0x0350:
        L_0x0351:
            if (r10 != 0) goto L_0x03f3
            long r7 = java.lang.System.nanoTime()
            int r3 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0370
            kb r3 = r1.f9733h
            ka r3 = r3.mo5390a(r14)
            long r9 = r3.f9722b
            r16 = 0
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x036a
            goto L_0x0370
        L_0x036a:
            long r9 = r9 + r7
            int r3 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r3 < 0) goto L_0x0370
            return r6
        L_0x0370:
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            jp r5 = r3.f1067g
            java.lang.String r9 = "RV CreateView"
            p000.C0049bu.m4189a(r9)     // Catch:{ all -> 0x03b6 }
            km r10 = r5.mo2795a(r3, r14)     // Catch:{ all -> 0x03b6 }
            android.view.View r3 = r10.f9783a     // Catch:{ all -> 0x03b6 }
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x03b6 }
            if (r3 != 0) goto L_0x03ae
            r10.f9788f = r14     // Catch:{ all -> 0x03b6 }
            p000.C0049bu.m4188a()
            android.view.View r3 = r10.f9783a
            android.support.v7.widget.RecyclerView r3 = android.support.p002v7.widget.RecyclerView.m1303e(r3)
            if (r3 == 0) goto L_0x0399
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r10.f9784b = r5
        L_0x0399:
            long r16 = java.lang.System.nanoTime()
            kb r3 = r1.f9733h
            ka r3 = r3.mo5390a(r14)
            long r13 = r3.f9722b
            long r7 = r16 - r7
            long r7 = p000.C0274kb.m7756a(r13, r7)
            r3.f9722b = r7
            goto L_0x03f4
        L_0x03ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b6 }
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch:{ all -> 0x03b6 }
            throw r0     // Catch:{ all -> 0x03b6 }
        L_0x03b6:
            r0 = move-exception
            p000.C0049bu.m4188a()
            throw r0
        L_0x03bb:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Inconsistency detected. Invalid item position "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "(offset:"
            r3.append(r0)
            r3.append(r13)
            java.lang.String r0 = ").state:"
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f9731f
            kk r0 = r0.f1024D
            int r0 = r0.mo5420a()
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f9731f
            java.lang.String r0 = r0.mo822a()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x03f3:
        L_0x03f4:
            if (r2 == 0) goto L_0x042c
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            kk r3 = r3.f1024D
            boolean r3 = r3.f9765g
            if (r3 == 0) goto L_0x03ff
            goto L_0x042c
        L_0x03ff:
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r5 = r10.mo5448o(r3)
            if (r5 == 0) goto L_0x042c
            r10.mo5428a(r4, r3)
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            kk r3 = r3.f1024D
            boolean r3 = r3.f9768j
            if (r3 == 0) goto L_0x042c
            int r3 = p000.C0266ju.m7667d(r10)
            android.support.v7.widget.RecyclerView r5 = r1.f9731f
            ju r7 = r5.f1084x
            kk r5 = r5.f1024D
            java.util.List r8 = r10.mo5450q()
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            jt r3 = r7.mo3744a(r5, r10, r3, r8)
            android.support.v7.widget.RecyclerView r5 = r1.f9731f
            r5.mo836a(r10, r3)
        L_0x042c:
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            kk r3 = r3.f1024D
            boolean r3 = r3.f9765g
            if (r3 == 0) goto L_0x0441
            boolean r3 = r10.mo5444l()
            if (r3 != 0) goto L_0x043b
            goto L_0x0441
        L_0x043b:
            r10.f9789g = r0
        L_0x043d:
            r0 = 0
            r11 = 1
            goto L_0x0528
        L_0x0441:
            boolean r3 = r10.mo5444l()
            if (r3 != 0) goto L_0x0448
        L_0x0447:
            goto L_0x0455
        L_0x0448:
            boolean r3 = r10.mo5443k()
            if (r3 != 0) goto L_0x0447
            boolean r3 = r10.mo5442j()
            if (r3 != 0) goto L_0x0447
        L_0x0454:
            goto L_0x043d
        L_0x0455:
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            gw r3 = r3.f1062b
            int r3 = r3.mo5087b(r0)
            android.support.v7.widget.RecyclerView r5 = r1.f9731f
            r10.f9797o = r5
            int r5 = r10.f9788f
            long r7 = java.lang.System.nanoTime()
            int r9 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0480
            kb r9 = r1.f9733h
            ka r5 = r9.mo5390a(r5)
            long r11 = r5.f9723c
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x047a
            goto L_0x0480
        L_0x047a:
            long r11 = r11 + r7
            int r5 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r5 < 0) goto L_0x0480
            goto L_0x0454
        L_0x0480:
            android.support.v7.widget.RecyclerView r5 = r1.f9731f
            jp r5 = r5.f1067g
            r10.f9785c = r3
            boolean r9 = r5.f9698a
            if (r9 == 0) goto L_0x0490
            long r11 = r5.mo2835b(r3)
            r10.f9787e = r11
        L_0x0490:
            r9 = 519(0x207, float:7.27E-43)
            r11 = 1
            r10.mo5428a(r11, r9)
            java.lang.String r9 = "RV OnBindView"
            p000.C0049bu.m4189a(r9)
            java.util.List r9 = r10.mo5450q()
            r5.mo2854a(r10, r3, r9)
            r10.mo5449p()
            android.view.View r3 = r10.f9783a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r5 = r3 instanceof p000.C0270jy
            if (r5 == 0) goto L_0x04b4
            jy r3 = (p000.C0270jy) r3
            r5 = 1
            r3.f9719c = r5
        L_0x04b4:
            p000.C0049bu.m4188a()
            long r11 = java.lang.System.nanoTime()
            kb r3 = r1.f9733h
            int r5 = r10.f9788f
            ka r3 = r3.mo5390a(r5)
            long r13 = r3.f9723c
            long r11 = r11 - r7
            long r7 = p000.C0274kb.m7756a(r13, r11)
            r3.f9723c = r7
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            boolean r3 = r3.mo891k()
            if (r3 != 0) goto L_0x04d6
            r11 = 1
            goto L_0x051b
        L_0x04d6:
            android.view.View r3 = r10.f9783a
            int r5 = p000.C0107dx.m7208e(r3)
            if (r5 == 0) goto L_0x04e0
            r11 = 1
            goto L_0x04e5
        L_0x04e0:
            r11 = 1
            p000.C0107dx.m7196a(r3, r11)
        L_0x04e5:
            android.support.v7.widget.RecyclerView r5 = r1.f9731f
            ko r5 = r5.f1029I
            if (r5 == 0) goto L_0x051b
            dj r5 = r5.mo5456b()
            boolean r7 = r5 instanceof p000.C0286kn
            if (r7 == 0) goto L_0x0518
            r7 = r5
            kn r7 = (p000.C0286kn) r7
            android.view.View$AccessibilityDelegate r8 = p000.C0107dx.m7204b(r3)
            if (r8 == 0) goto L_0x050c
            boolean r6 = r8 instanceof p000.C0092di
            if (r6 == 0) goto L_0x0505
            di r8 = (p000.C0092di) r8
            dj r6 = r8.f8571a
            goto L_0x050e
        L_0x0505:
            dj r6 = new dj
            r6.<init>(r8)
            goto L_0x050e
        L_0x050c:
        L_0x050e:
            if (r6 != 0) goto L_0x0511
            goto L_0x0518
        L_0x0511:
            if (r6 == r7) goto L_0x0518
            java.util.Map r7 = r7.f9801b
            r7.put(r3, r6)
        L_0x0518:
            p000.C0107dx.m7200a(r3, r5)
        L_0x051b:
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            kk r3 = r3.f1024D
            boolean r3 = r3.f9765g
            if (r3 == 0) goto L_0x0526
            r10.f9789g = r0
            goto L_0x0527
        L_0x0526:
        L_0x0527:
            r0 = 1
        L_0x0528:
            android.view.View r3 = r10.f9783a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x053f
            android.support.v7.widget.RecyclerView r3 = r1.f9731f
            android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
            jy r3 = (p000.C0270jy) r3
            android.view.View r5 = r10.f9783a
            r5.setLayoutParams(r3)
            goto L_0x0557
        L_0x053f:
            android.support.v7.widget.RecyclerView r5 = r1.f9731f
            boolean r5 = r5.checkLayoutParams(r3)
            if (r5 != 0) goto L_0x0555
            android.support.v7.widget.RecyclerView r5 = r1.f9731f
            android.view.ViewGroup$LayoutParams r3 = r5.generateLayoutParams(r3)
            jy r3 = (p000.C0270jy) r3
            android.view.View r5 = r10.f9783a
            r5.setLayoutParams(r3)
            goto L_0x0557
        L_0x0555:
            jy r3 = (p000.C0270jy) r3
        L_0x0557:
            r3.f9717a = r10
            if (r2 != 0) goto L_0x055c
        L_0x055b:
            goto L_0x055f
        L_0x055c:
            if (r0 == 0) goto L_0x055b
            r4 = 1
        L_0x055f:
            r3.f9720d = r4
            return r10
        L_0x0562:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid item position "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = "("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "). Item count:"
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f9731f
            kk r0 = r0.f1024D
            int r0 = r0.mo5420a()
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f9731f
            java.lang.String r0 = r0.mo822a()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            goto L_0x059b
        L_0x059a:
            throw r2
        L_0x059b:
            goto L_0x059a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0275kc.mo5392a(int, long):km");
    }

    /* renamed from: b */
    public final void mo5400b(C0285km kmVar) {
        if (kmVar.f9794l) {
            this.f9727b.remove(kmVar);
        } else {
            this.f9726a.remove(kmVar);
        }
        kmVar.f9793k = null;
        kmVar.f9794l = false;
        kmVar.mo5440h();
    }

    /* renamed from: b */
    public final void mo5397b() {
        C0269jx jxVar = this.f9731f.f1068h;
        this.f9732g = this.f9730e + (jxVar != null ? jxVar.f9713f : 0);
        for (int size = this.f9728c.size() - 1; size >= 0 && this.f9728c.size() > this.f9732g; size--) {
            mo5398b(size);
        }
    }
}
