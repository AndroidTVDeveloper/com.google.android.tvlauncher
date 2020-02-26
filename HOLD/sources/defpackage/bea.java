package defpackage;

import android.util.Log;
import java.util.List;

/* renamed from: bea  reason: default package */
/* compiled from: PG */
public final class bea extends bed {
    private final bky a = new bky();
    private final bkx c = new bkx();
    private final int d;
    private final bdy[] e;
    private bdy f;
    private List g;
    private List h;
    private bdz i;
    private int j;

    public bea(int i2) {
        this.d = i2 == -1 ? 1 : i2;
        this.e = new bdy[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.e[i3] = new bdy();
        }
        this.f = this.e[0];
        i();
    }

    public final /* bridge */ /* synthetic */ void d() {
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return this.g != this.h;
    }

    /* access modifiers changed from: protected */
    public final bdl f() {
        List list = this.g;
        this.h = list;
        return new bee(list);
    }

    /* access modifiers changed from: protected */
    public final void a(bdq bdq) {
        bdz bdz;
        this.a.a(bdq.c.array(), bdq.c.limit());
        while (this.a.b() >= 3) {
            int d2 = this.a.d() & 7;
            int i2 = d2 & 3;
            int i3 = d2 & 4;
            byte d3 = (byte) this.a.d();
            byte d4 = (byte) this.a.d();
            if ((i2 == 2 || i2 == 3) && i3 == 4) {
                if (i2 == 3) {
                    g();
                    int i4 = (d3 & 192) >> 6;
                    byte b = d3 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    bdz = new bdz(i4, b);
                    this.i = bdz;
                    byte[] bArr = bdz.c;
                    int i5 = bdz.d;
                    bdz.d = i5 + 1;
                    bArr[i5] = d4;
                } else {
                    bks.a(true);
                    bdz = this.i;
                    if (bdz != null) {
                        byte[] bArr2 = bdz.c;
                        int i6 = bdz.d;
                        int i7 = i6 + 1;
                        bdz.d = i7;
                        bArr2[i6] = d3;
                        bdz.d = i7 + 1;
                        bArr2[i7] = d4;
                    } else {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    }
                }
                int i8 = bdz.d;
                int i9 = bdz.b;
                if (i8 == (i9 + i9) - 1) {
                    g();
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder}
     arg types: [int, int]
     candidates:
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.Editable}
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdy.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      bdy.a(int, int):void
      bdy.a(boolean, boolean):void */
    private final void g() {
        bdz bdz = this.i;
        if (bdz != null) {
            int i2 = bdz.d;
            int i3 = bdz.b;
            int i4 = (i3 + i3) - 1;
            if (i2 != i4) {
                int i5 = bdz.a;
                StringBuilder sb = new StringBuilder(131);
                sb.append("DtvCcPacket ended prematurely; size is ");
                sb.append(i4);
                sb.append(", but current index is ");
                sb.append(i2);
                sb.append(" (sequence number ");
                sb.append(i5);
                sb.append("); ignoring packet");
                Log.w("Cea708Decoder", sb.toString());
            } else {
                this.c.a(bdz.c, i2);
                int i6 = 3;
                int c2 = this.c.c(3);
                int c3 = this.c.c(5);
                int i7 = 44;
                int i8 = 6;
                if (c2 == 7) {
                    this.c.b(2);
                    c2 = this.c.c(6);
                    if (c2 < 7) {
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Invalid extended service number: ");
                        sb2.append(c2);
                        Log.w("Cea708Decoder", sb2.toString());
                    }
                }
                if (c3 != 0) {
                    if (c2 == this.d) {
                        boolean z = false;
                        while (this.c.a() > 0) {
                            int c4 = this.c.c(8);
                            if (c4 == 16) {
                                int c5 = this.c.c(8);
                                if (c5 > 31) {
                                    if (c5 <= 127) {
                                        if (c5 == 32) {
                                            this.f.a(' ');
                                            z = true;
                                        } else if (c5 == 33) {
                                            this.f.a(160);
                                            z = true;
                                        } else if (c5 == 37) {
                                            this.f.a(8230);
                                            z = true;
                                        } else if (c5 == 42) {
                                            this.f.a(352);
                                            z = true;
                                        } else if (c5 == i7) {
                                            this.f.a(338);
                                            z = true;
                                        } else if (c5 == 63) {
                                            this.f.a(376);
                                            z = true;
                                        } else if (c5 == 57) {
                                            this.f.a(8482);
                                            z = true;
                                        } else if (c5 == 58) {
                                            this.f.a(353);
                                            z = true;
                                        } else if (c5 == 60) {
                                            this.f.a(339);
                                            z = true;
                                        } else if (c5 != 61) {
                                            switch (c5) {
                                                case 48:
                                                    this.f.a(9608);
                                                    z = true;
                                                    continue;
                                                case 49:
                                                    this.f.a(8216);
                                                    z = true;
                                                    continue;
                                                case 50:
                                                    this.f.a(8217);
                                                    z = true;
                                                    continue;
                                                case 51:
                                                    this.f.a(8220);
                                                    z = true;
                                                    continue;
                                                case 52:
                                                    this.f.a(8221);
                                                    z = true;
                                                    continue;
                                                case 53:
                                                    this.f.a(8226);
                                                    z = true;
                                                    continue;
                                                default:
                                                    switch (c5) {
                                                        case 118:
                                                            this.f.a(8539);
                                                            z = true;
                                                            continue;
                                                        case 119:
                                                            this.f.a(8540);
                                                            z = true;
                                                            continue;
                                                        case 120:
                                                            this.f.a(8541);
                                                            z = true;
                                                            continue;
                                                        case 121:
                                                            this.f.a(8542);
                                                            z = true;
                                                            continue;
                                                        case 122:
                                                            this.f.a(9474);
                                                            z = true;
                                                            continue;
                                                        case 123:
                                                            this.f.a(9488);
                                                            z = true;
                                                            continue;
                                                        case 124:
                                                            this.f.a(9492);
                                                            z = true;
                                                            continue;
                                                        case 125:
                                                            this.f.a(9472);
                                                            z = true;
                                                            continue;
                                                        case 126:
                                                            this.f.a(9496);
                                                            z = true;
                                                            continue;
                                                        case 127:
                                                            this.f.a(9484);
                                                            z = true;
                                                            continue;
                                                        default:
                                                            StringBuilder sb3 = new StringBuilder(33);
                                                            sb3.append("Invalid G2 character: ");
                                                            sb3.append(c5);
                                                            Log.w("Cea708Decoder", sb3.toString());
                                                            z = true;
                                                            continue;
                                                            continue;
                                                    }
                                            }
                                        } else {
                                            this.f.a(8480);
                                            z = true;
                                        }
                                    } else if (c5 <= 159) {
                                        if (c5 <= 135) {
                                            this.c.b(32);
                                        } else if (c5 > 143) {
                                            this.c.b(2);
                                            this.c.b(this.c.c(i8) << i6);
                                        } else {
                                            this.c.b(40);
                                        }
                                    } else if (c5 > 255) {
                                        StringBuilder sb4 = new StringBuilder(37);
                                        sb4.append("Invalid extended command: ");
                                        sb4.append(c5);
                                        Log.w("Cea708Decoder", sb4.toString());
                                    } else if (c5 != 160) {
                                        StringBuilder sb5 = new StringBuilder(33);
                                        sb5.append("Invalid G3 character: ");
                                        sb5.append(c5);
                                        Log.w("Cea708Decoder", sb5.toString());
                                        this.f.a('_');
                                        z = true;
                                    } else {
                                        this.f.a(13252);
                                        z = true;
                                    }
                                } else if (c5 > 7) {
                                    if (c5 <= 15) {
                                        this.c.b(8);
                                    } else if (c5 > 23) {
                                        this.c.b(24);
                                    } else {
                                        this.c.b(16);
                                    }
                                }
                                i6 = 3;
                                i7 = 44;
                            } else {
                                if (c4 <= 31) {
                                    if (c4 != 0) {
                                        if (c4 == i6) {
                                            this.g = h();
                                        } else if (c4 != 8) {
                                            switch (c4) {
                                                case 12:
                                                    i();
                                                    break;
                                                case 13:
                                                    this.f.a(10);
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (c4 < 17 || c4 > 23) {
                                                        if (c4 < 24) {
                                                            StringBuilder sb6 = new StringBuilder(31);
                                                            sb6.append("Invalid C0 command: ");
                                                            sb6.append(c4);
                                                            Log.w("Cea708Decoder", sb6.toString());
                                                            break;
                                                        } else {
                                                            StringBuilder sb7 = new StringBuilder(54);
                                                            sb7.append("Currently unsupported COMMAND_P16 Command: ");
                                                            sb7.append(c4);
                                                            Log.w("Cea708Decoder", sb7.toString());
                                                            this.c.b(16);
                                                            break;
                                                        }
                                                    } else {
                                                        StringBuilder sb8 = new StringBuilder(55);
                                                        sb8.append("Currently unsupported COMMAND_EXT1 Command: ");
                                                        sb8.append(c4);
                                                        Log.w("Cea708Decoder", sb8.toString());
                                                        this.c.b(8);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            bdy bdy = this.f;
                                            int length = bdy.g.length();
                                            if (length > 0) {
                                                bdy.g.delete(length - 1, length);
                                            }
                                        }
                                    }
                                } else if (c4 <= 127) {
                                    if (c4 != 127) {
                                        this.f.a((char) (c4 & 255));
                                        i7 = 44;
                                        z = true;
                                    } else {
                                        this.f.a(9835);
                                        i7 = 44;
                                        z = true;
                                    }
                                } else if (c4 <= 159) {
                                    switch (c4) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i9 = c4 - 128;
                                            if (this.j != i9) {
                                                this.j = i9;
                                                this.f = this.e[i9];
                                                i6 = 3;
                                                i7 = 44;
                                                z = true;
                                                break;
                                            }
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 136:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (this.c.e()) {
                                                    this.e[8 - i10].c();
                                                }
                                            }
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 137:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (this.c.e()) {
                                                    this.e[8 - i11].i = true;
                                                }
                                            }
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (this.c.e()) {
                                                    this.e[8 - i12].i = false;
                                                }
                                            }
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (this.c.e()) {
                                                    bdy bdy2 = this.e[8 - i13];
                                                    bdy2.i = !bdy2.i;
                                                }
                                            }
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (this.c.e()) {
                                                    this.e[8 - i14].b();
                                                }
                                            }
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 141:
                                            this.c.b(8);
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 142:
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 143:
                                            i();
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 144:
                                            if (this.f.h) {
                                                this.c.c(4);
                                                this.c.c(2);
                                                this.c.c(2);
                                                boolean e2 = this.c.e();
                                                boolean e3 = this.c.e();
                                                this.c.c(3);
                                                this.c.c(3);
                                                this.f.a(e2, e3);
                                                i6 = 3;
                                                i7 = 44;
                                                z = true;
                                                break;
                                            } else {
                                                this.c.b(16);
                                                i6 = 3;
                                                i7 = 44;
                                                z = true;
                                                break;
                                            }
                                        case 145:
                                            if (this.f.h) {
                                                int a2 = bdy.a(this.c.c(2), this.c.c(2), this.c.c(2), this.c.c(2));
                                                int a3 = bdy.a(this.c.c(2), this.c.c(2), this.c.c(2), this.c.c(2));
                                                this.c.b(2);
                                                bdy.a(this.c.c(2), this.c.c(2), this.c.c(2));
                                                this.f.a(a2, a3);
                                                i6 = 3;
                                                i7 = 44;
                                                z = true;
                                                break;
                                            } else {
                                                this.c.b(24);
                                                i6 = 3;
                                                i7 = 44;
                                                z = true;
                                                break;
                                            }
                                        case 146:
                                            if (this.f.h) {
                                                this.c.b(4);
                                                int c6 = this.c.c(4);
                                                this.c.b(2);
                                                i8 = 6;
                                                this.c.c(6);
                                                bdy bdy3 = this.f;
                                                if (bdy3.u != c6) {
                                                    bdy3.a(10);
                                                }
                                                bdy3.u = c6;
                                                i6 = 3;
                                                i7 = 44;
                                                z = true;
                                                break;
                                            } else {
                                                this.c.b(16);
                                                i6 = 3;
                                                i7 = 44;
                                                i8 = 6;
                                                z = true;
                                                break;
                                            }
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            StringBuilder sb9 = new StringBuilder(31);
                                            sb9.append("Invalid C1 command: ");
                                            sb9.append(c4);
                                            Log.w("Cea708Decoder", sb9.toString());
                                            i6 = 3;
                                            i7 = 44;
                                            z = true;
                                            break;
                                        case 151:
                                            if (!this.f.h) {
                                                this.c.b(32);
                                                i6 = 3;
                                                i7 = 44;
                                                i8 = 6;
                                                z = true;
                                                break;
                                            } else {
                                                int a4 = bdy.a(this.c.c(2), this.c.c(2), this.c.c(2), this.c.c(2));
                                                this.c.c(2);
                                                bdy.a(this.c.c(2), this.c.c(2), this.c.c(2));
                                                this.c.e();
                                                this.c.e();
                                                this.c.c(2);
                                                this.c.c(2);
                                                int c7 = this.c.c(2);
                                                this.c.b(8);
                                                this.f.b(a4, c7);
                                                i6 = 3;
                                                i7 = 44;
                                                i8 = 6;
                                                z = true;
                                                break;
                                            }
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i15 = c4 - 152;
                                            bdy bdy4 = this.e[i15];
                                            this.c.b(2);
                                            boolean e4 = this.c.e();
                                            boolean e5 = this.c.e();
                                            this.c.e();
                                            int c8 = this.c.c(i6);
                                            boolean e6 = this.c.e();
                                            int c9 = this.c.c(7);
                                            int c10 = this.c.c(8);
                                            int c11 = this.c.c(4);
                                            int c12 = this.c.c(4);
                                            this.c.b(2);
                                            this.c.c(i8);
                                            this.c.b(2);
                                            int c13 = this.c.c(i6);
                                            int c14 = this.c.c(i6);
                                            bdy4.h = true;
                                            bdy4.i = e4;
                                            bdy4.p = e5;
                                            bdy4.j = c8;
                                            bdy4.k = e6;
                                            bdy4.l = c9;
                                            bdy4.m = c10;
                                            bdy4.n = c11;
                                            int i16 = c12 + 1;
                                            if (bdy4.o != i16) {
                                                bdy4.o = i16;
                                                while (true) {
                                                    if (!e5 || bdy4.f.size() < bdy4.o) {
                                                        if (bdy4.f.size() >= 15) {
                                                        }
                                                    }
                                                    bdy4.f.remove(0);
                                                }
                                            }
                                            if (!(c13 == 0 || bdy4.r == c13)) {
                                                bdy4.r = c13;
                                                int i17 = c13 - 1;
                                                bdy4.b(bdy.d[i17], bdy.c[i17]);
                                            }
                                            if (!(c14 == 0 || bdy4.s == c14)) {
                                                bdy4.s = c14;
                                                int i18 = bdy.a;
                                                bdy4.a(false, false);
                                                bdy4.a(bdy.a, bdy.e[c14 - 1]);
                                            }
                                            if (this.j == i15) {
                                                i6 = 3;
                                                i7 = 44;
                                                i8 = 6;
                                                z = true;
                                                break;
                                            } else {
                                                this.j = i15;
                                                this.f = this.e[i15];
                                                i6 = 3;
                                                i7 = 44;
                                                i8 = 6;
                                                z = true;
                                                break;
                                            }
                                    }
                                } else if (c4 > 255) {
                                    StringBuilder sb10 = new StringBuilder(33);
                                    sb10.append("Invalid base command: ");
                                    sb10.append(c4);
                                    Log.w("Cea708Decoder", sb10.toString());
                                } else {
                                    this.f.a((char) (c4 & 255));
                                    i6 = 3;
                                    i7 = 44;
                                    z = true;
                                }
                                i6 = 3;
                                i7 = 44;
                            }
                            i6 = 3;
                            i7 = 44;
                        }
                        if (z) {
                            this.g = h();
                        }
                    }
                } else if (c2 != 0) {
                    StringBuilder sb11 = new StringBuilder(59);
                    sb11.append("serviceNumber is non-zero (");
                    sb11.append(c2);
                    sb11.append(") when blockSize is 0");
                    Log.w("Cea708Decoder", sb11.toString());
                }
            }
            this.i = null;
        }
    }

    public final void c() {
        super.c();
        this.g = null;
        this.h = null;
        this.j = 0;
        this.f = this.e[0];
        i();
        this.i = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List h() {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x0009:
            r4 = 8
            if (r3 >= r4) goto L_0x00e8
            bdy[] r4 = r0.e
            r4 = r4[r3]
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x00e4
            bdy[] r4 = r0.e
            r4 = r4[r3]
            boolean r5 = r4.i
            if (r5 != 0) goto L_0x0021
            goto L_0x00e4
        L_0x0021:
            boolean r5 = r4.a()
            if (r5 != 0) goto L_0x00dc
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r5 = 0
        L_0x002d:
            java.util.List r6 = r4.f
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0048
            java.util.List r6 = r4.f
            java.lang.Object r6 = r6.get(r5)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7.append(r6)
            r6 = 10
            r7.append(r6)
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0048:
            android.text.SpannableString r5 = r4.d()
            r7.append(r5)
            int r5 = r4.q
            r6 = 2
            r8 = 1
            if (r5 == 0) goto L_0x007c
            if (r5 == r8) goto L_0x0079
            if (r5 == r6) goto L_0x0076
            r9 = 3
            if (r5 != r9) goto L_0x005d
            goto L_0x007c
        L_0x005d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 43
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected justification value: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0076:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x007e
        L_0x0079:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x007e
        L_0x007c:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x007e:
            boolean r9 = r4.k
            if (r9 != 0) goto L_0x008f
            int r9 = r4.m
            float r9 = (float) r9
            r10 = 1129381888(0x43510000, float:209.0)
            float r9 = r9 / r10
            int r10 = r4.l
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r10 = r10 / r11
            goto L_0x009a
        L_0x008f:
            int r9 = r4.m
            float r9 = (float) r9
            r10 = 1120272384(0x42c60000, float:99.0)
            float r9 = r9 / r10
            int r11 = r4.l
            float r11 = (float) r11
            float r10 = r11 / r10
        L_0x009a:
            r11 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r11
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r13 = r9 + r12
            float r10 = r10 * r11
            float r9 = r10 + r12
            int r10 = r4.n
            int r11 = r10 % 3
            if (r11 != 0) goto L_0x00b0
            r11 = 0
            goto L_0x00b5
        L_0x00b0:
            if (r11 != r8) goto L_0x00b4
            r11 = 1
            goto L_0x00b5
        L_0x00b4:
            r11 = 2
        L_0x00b5:
            int r10 = r10 / 3
            if (r10 != 0) goto L_0x00bb
            r12 = 0
            goto L_0x00c0
        L_0x00bb:
            if (r10 != r8) goto L_0x00bf
            r12 = 1
            goto L_0x00c0
        L_0x00bf:
            r12 = 2
        L_0x00c0:
            int r6 = r4.t
            int r10 = defpackage.bdy.b
            if (r6 == r10) goto L_0x00c8
            r14 = 1
            goto L_0x00ca
        L_0x00c8:
            r14 = 0
        L_0x00ca:
            bdx r16 = new bdx
            int r15 = r4.t
            int r4 = r4.j
            r6 = r16
            r8 = r5
            r10 = r11
            r11 = r13
            r13 = r14
            r14 = r15
            r15 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00df
        L_0x00dc:
            r16 = 0
        L_0x00df:
            r4 = r16
            r1.add(r4)
        L_0x00e4:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x00e8:
            java.util.Collections.sort(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bea.h():java.util.List");
    }

    private final void i() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.e[i2].b();
        }
    }
}
