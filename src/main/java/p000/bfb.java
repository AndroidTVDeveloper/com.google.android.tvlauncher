package p000;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: bfb */
/* compiled from: PG */
final class bfb {

    /* renamed from: a */
    public final long f3623a;

    /* renamed from: b */
    public final long f3624b;

    /* renamed from: c */
    public final String f3625c;

    /* renamed from: d */
    private final String f3626d;

    /* renamed from: e */
    private final String f3627e;

    /* renamed from: f */
    private final boolean f3628f;

    /* renamed from: g */
    private final bfd f3629g;

    /* renamed from: h */
    private final String[] f3630h;

    /* renamed from: i */
    private final String f3631i;

    /* renamed from: j */
    private final HashMap f3632j;

    /* renamed from: k */
    private final HashMap f3633k;

    /* renamed from: l */
    private List f3634l;

    public bfb(String str, String str2, long j, long j2, bfd bfd, String[] strArr, String str3, String str4) {
        boolean z;
        this.f3626d = str;
        this.f3627e = str2;
        this.f3631i = str4;
        this.f3629g = bfd;
        this.f3630h = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f3628f = z;
        this.f3623a = j;
        this.f3624b = j2;
        this.f3625c = (String) bks.m3507a((Object) str3);
        this.f3632j = new HashMap();
        this.f3633k = new HashMap();
    }

    /* renamed from: a */
    private final boolean m3025a(long j) {
        long j2 = this.f3623a;
        if (j2 == -9223372036854775807L && this.f3624b == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.f3624b == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.f3624b) {
            return j2 <= j && j < this.f3624b;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1811a(bfb bfb) {
        if (this.f3634l == null) {
            this.f3634l = new ArrayList();
        }
        this.f3634l.add(bfb);
    }

    /* renamed from: a */
    private final bfb m3024a(int i) {
        List list = this.f3634l;
        if (list != null) {
            return (bfb) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    private final int m3022a() {
        List list = this.f3634l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public final void mo1812a(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.f3626d);
        boolean equals2 = "div".equals(this.f3626d);
        if (z || equals || (equals2 && this.f3631i != null)) {
            long j = this.f3623a;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f3624b;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f3634l != null) {
            for (int i = 0; i < this.f3634l.size(); i++) {
                bfb bfb = (bfb) this.f3634l.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                bfb.mo1812a(treeSet, z2);
            }
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m3023a(String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    /* renamed from: a */
    public final void mo1808a(long j, String str, List list) {
        String str2;
        if (!"".equals(this.f3625c)) {
            str = this.f3625c;
        }
        if (!m3025a(j) || !"div".equals(this.f3626d) || (str2 = this.f3631i) == null) {
            for (int i = 0; i < m3022a(); i++) {
                m3024a(i).mo1808a(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: bfd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1809a(long r11, java.util.Map r13, java.util.Map r14) {
        /*
            r10 = this;
            boolean r0 = r10.m3025a(r11)
            if (r0 == 0) goto L_0x0159
            java.util.HashMap r0 = r10.f3633k
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0147
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r4 = r10.f3632j
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0038
            java.util.HashMap r4 = r10.f3632j
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x003a
        L_0x0038:
            r4 = 0
        L_0x003a:
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r4 == r1) goto L_0x0010
            java.lang.Object r3 = r14.get(r3)
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
            bfd r5 = r10.f3629g
            java.lang.String[] r6 = r10.f3630h
            r7 = 1
            if (r5 != 0) goto L_0x0057
            if (r6 != 0) goto L_0x0057
            r5 = 0
            goto L_0x00af
        L_0x0057:
            if (r5 != 0) goto L_0x0066
            int r8 = r6.length
            if (r8 != r7) goto L_0x0066
            r2 = r6[r2]
            java.lang.Object r2 = r13.get(r2)
            r5 = r2
            bfd r5 = (p000.bfd) r5
            goto L_0x00af
        L_0x0066:
            if (r5 != 0) goto L_0x0082
            int r8 = r6.length
            if (r8 <= r7) goto L_0x0082
            bfd r9 = new bfd
            r9.<init>()
        L_0x0070:
            if (r2 < r8) goto L_0x0074
            r5 = r9
            goto L_0x00af
        L_0x0074:
            r5 = r6[r2]
            java.lang.Object r5 = r13.get(r5)
            bfd r5 = (p000.bfd) r5
            r9.mo1815a(r5)
            int r2 = r2 + 1
            goto L_0x0070
        L_0x0082:
            if (r5 == 0) goto L_0x0096
            if (r6 == 0) goto L_0x0096
            int r8 = r6.length
            if (r8 != r7) goto L_0x0096
            r2 = r6[r2]
            java.lang.Object r2 = r13.get(r2)
            bfd r2 = (p000.bfd) r2
            r5.mo1815a(r2)
            goto L_0x00af
        L_0x0096:
            if (r5 == 0) goto L_0x00ae
            if (r6 == 0) goto L_0x00ae
            int r8 = r6.length
            if (r8 <= r7) goto L_0x00ae
        L_0x009d:
            if (r2 < r8) goto L_0x00a0
            goto L_0x00ae
        L_0x00a0:
            r9 = r6[r2]
            java.lang.Object r9 = r13.get(r9)
            bfd r9 = (p000.bfd) r9
            r5.mo1815a(r9)
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00ae:
        L_0x00af:
            if (r5 == 0) goto L_0x0010
            int r2 = r5.mo1813a()
            r6 = -1
            r8 = 33
            if (r2 == r6) goto L_0x00c6
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            int r6 = r5.mo1813a()
            r2.<init>(r6)
            r3.setSpan(r2, r4, r1, r8)
        L_0x00c6:
            int r2 = r5.f3649f
            if (r2 != r7) goto L_0x00d2
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            r3.setSpan(r2, r4, r1, r8)
        L_0x00d2:
            int r2 = r5.f3650g
            if (r2 != r7) goto L_0x00de
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r3.setSpan(r2, r4, r1, r8)
        L_0x00de:
            boolean r2 = r5.f3646c
            if (r2 == 0) goto L_0x00ec
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            int r6 = r5.f3645b
            r2.<init>(r6)
            r3.setSpan(r2, r4, r1, r8)
        L_0x00ec:
            boolean r2 = r5.f3648e
            if (r2 != 0) goto L_0x00f1
            goto L_0x00fb
        L_0x00f1:
            android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
            int r6 = r5.f3647d
            r2.<init>(r6)
            r3.setSpan(r2, r4, r1, r8)
        L_0x00fb:
            java.lang.String r2 = r5.f3644a
            if (r2 == 0) goto L_0x0107
            android.text.style.TypefaceSpan r6 = new android.text.style.TypefaceSpan
            r6.<init>(r2)
            r3.setSpan(r6, r4, r1, r8)
        L_0x0107:
            android.text.Layout$Alignment r2 = r5.f3656m
            if (r2 == 0) goto L_0x0113
            android.text.style.AlignmentSpan$Standard r6 = new android.text.style.AlignmentSpan$Standard
            r6.<init>(r2)
            r3.setSpan(r6, r4, r1, r8)
        L_0x0113:
            int r2 = r5.f3653j
            if (r2 == r7) goto L_0x013a
            r6 = 2
            if (r2 == r6) goto L_0x012e
            r6 = 3
            if (r2 == r6) goto L_0x011f
            goto L_0x0010
        L_0x011f:
            android.text.style.RelativeSizeSpan r2 = new android.text.style.RelativeSizeSpan
            float r5 = r5.f3654k
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            r2.<init>(r5)
            r3.setSpan(r2, r4, r1, r8)
            goto L_0x0010
        L_0x012e:
            android.text.style.RelativeSizeSpan r2 = new android.text.style.RelativeSizeSpan
            float r5 = r5.f3654k
            r2.<init>(r5)
            r3.setSpan(r2, r4, r1, r8)
            goto L_0x0010
        L_0x013a:
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            float r5 = r5.f3654k
            int r5 = (int) r5
            r2.<init>(r5, r7)
            r3.setSpan(r2, r4, r1, r8)
            goto L_0x0010
        L_0x0147:
        L_0x0149:
            int r0 = r10.m3022a()
            if (r2 >= r0) goto L_0x0159
            bfb r0 = r10.m3024a(r2)
            r0.mo1809a(r11, r13, r14)
            int r2 = r2 + 1
            goto L_0x0149
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bfb.mo1809a(long, java.util.Map, java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo1810a(long j, boolean z, String str, Map map) {
        this.f3632j.clear();
        this.f3633k.clear();
        if (!"metadata".equals(this.f3626d)) {
            if (!"".equals(this.f3625c)) {
                str = this.f3625c;
            }
            if (this.f3628f && z) {
                m3023a(str, map).append((CharSequence) this.f3627e);
            } else if ("br".equals(this.f3626d) && z) {
                m3023a(str, map).append(10);
            } else if (m3025a(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    this.f3632j.put((String) entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                }
                boolean equals = "p".equals(this.f3626d);
                for (int i = 0; i < m3022a(); i++) {
                    m3024a(i).mo1810a(j, z || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder a = m3023a(str, map);
                    int length = a.length() - 1;
                    while (length >= 0 && a.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && a.charAt(length) != 10) {
                        a.append(10);
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    this.f3633k.put((String) entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                }
            }
        }
    }
}
