package p000;

import android.util.Log;
import java.util.List;

/* renamed from: bea */
/* compiled from: PG */
public final class bea extends bed {

    /* renamed from: a */
    private final bky f3508a = new bky();

    /* renamed from: c */
    private final bkx f3509c = new bkx();

    /* renamed from: d */
    private final int f3510d;

    /* renamed from: e */
    private final bdy[] f3511e;

    /* renamed from: f */
    private bdy f3512f;

    /* renamed from: g */
    private List f3513g;

    /* renamed from: h */
    private List f3514h;

    /* renamed from: i */
    private bdz f3515i;

    /* renamed from: j */
    private int f3516j;

    public bea(int i) {
        this.f3510d = i == -1 ? 1 : i;
        this.f3511e = new bdy[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f3511e[i2] = new bdy();
        }
        this.f3512f = this.f3511e[0];
        m2961i();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo1148d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo1795e() {
        return this.f3513g != this.f3514h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final bdl mo1796f() {
        List list = this.f3513g;
        this.f3514h = list;
        return new bee(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1794a(bdq bdq) {
        bdz bdz;
        this.f3508a.mo2068a(bdq.f1425c.array(), bdq.f1425c.limit());
        while (this.f3508a.mo2070b() >= 3) {
            int d = this.f3508a.mo2074d() & 7;
            int i = d & 3;
            int i2 = d & 4;
            byte d2 = (byte) this.f3508a.mo2074d();
            byte d3 = (byte) this.f3508a.mo2074d();
            if ((i == 2 || i == 3) && i2 == 4) {
                if (i == 3) {
                    m2959g();
                    int i3 = (d2 & 192) >> 6;
                    byte b = d2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    bdz = new bdz(i3, b);
                    this.f3515i = bdz;
                    byte[] bArr = bdz.f3505c;
                    int i4 = bdz.f3506d;
                    bdz.f3506d = i4 + 1;
                    bArr[i4] = d3;
                } else {
                    bks.m3510a(true);
                    bdz = this.f3515i;
                    if (bdz != null) {
                        byte[] bArr2 = bdz.f3505c;
                        int i5 = bdz.f3506d;
                        int i6 = i5 + 1;
                        bdz.f3506d = i6;
                        bArr2[i5] = d2;
                        bdz.f3506d = i6 + 1;
                        bArr2[i6] = d3;
                    } else {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    }
                }
                int i7 = bdz.f3506d;
                int i8 = bdz.f3504b;
                if (i7 == (i8 + i8) - 1) {
                    m2959g();
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
    /* renamed from: g */
    private final void m2959g() {
        bdz bdz = this.f3515i;
        if (bdz != null) {
            int i = bdz.f3506d;
            int i2 = bdz.f3504b;
            int i3 = (i2 + i2) - 1;
            if (i != i3) {
                int i4 = bdz.f3503a;
                StringBuilder sb = new StringBuilder(131);
                sb.append("DtvCcPacket ended prematurely; size is ");
                sb.append(i3);
                sb.append(", but current index is ");
                sb.append(i);
                sb.append(" (sequence number ");
                sb.append(i4);
                sb.append("); ignoring packet");
                Log.w("Cea708Decoder", sb.toString());
            } else {
                this.f3509c.mo2052a(bdz.f3505c, i);
                int i5 = 3;
                int c = this.f3509c.mo2057c(3);
                int c2 = this.f3509c.mo2057c(5);
                int i6 = 44;
                int i7 = 6;
                if (c == 7) {
                    this.f3509c.mo2054b(2);
                    c = this.f3509c.mo2057c(6);
                    if (c < 7) {
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Invalid extended service number: ");
                        sb2.append(c);
                        Log.w("Cea708Decoder", sb2.toString());
                    }
                }
                if (c2 != 0) {
                    if (c == this.f3510d) {
                        boolean z = false;
                        while (this.f3509c.mo2049a() > 0) {
                            int c3 = this.f3509c.mo2057c(8);
                            if (c3 == 16) {
                                int c4 = this.f3509c.mo2057c(8);
                                if (c4 > 31) {
                                    if (c4 <= 127) {
                                        if (c4 == 32) {
                                            this.f3512f.mo1798a(' ');
                                            z = true;
                                        } else if (c4 == 33) {
                                            this.f3512f.mo1798a(160);
                                            z = true;
                                        } else if (c4 == 37) {
                                            this.f3512f.mo1798a(8230);
                                            z = true;
                                        } else if (c4 == 42) {
                                            this.f3512f.mo1798a(352);
                                            z = true;
                                        } else if (c4 == i6) {
                                            this.f3512f.mo1798a(338);
                                            z = true;
                                        } else if (c4 == 63) {
                                            this.f3512f.mo1798a(376);
                                            z = true;
                                        } else if (c4 == 57) {
                                            this.f3512f.mo1798a(8482);
                                            z = true;
                                        } else if (c4 == 58) {
                                            this.f3512f.mo1798a(353);
                                            z = true;
                                        } else if (c4 == 60) {
                                            this.f3512f.mo1798a(339);
                                            z = true;
                                        } else if (c4 != 61) {
                                            switch (c4) {
                                                case 48:
                                                    this.f3512f.mo1798a(9608);
                                                    z = true;
                                                    continue;
                                                case 49:
                                                    this.f3512f.mo1798a(8216);
                                                    z = true;
                                                    continue;
                                                case 50:
                                                    this.f3512f.mo1798a(8217);
                                                    z = true;
                                                    continue;
                                                case 51:
                                                    this.f3512f.mo1798a(8220);
                                                    z = true;
                                                    continue;
                                                case 52:
                                                    this.f3512f.mo1798a(8221);
                                                    z = true;
                                                    continue;
                                                case 53:
                                                    this.f3512f.mo1798a(8226);
                                                    z = true;
                                                    continue;
                                                default:
                                                    switch (c4) {
                                                        case 118:
                                                            this.f3512f.mo1798a(8539);
                                                            z = true;
                                                            continue;
                                                        case 119:
                                                            this.f3512f.mo1798a(8540);
                                                            z = true;
                                                            continue;
                                                        case 120:
                                                            this.f3512f.mo1798a(8541);
                                                            z = true;
                                                            continue;
                                                        case 121:
                                                            this.f3512f.mo1798a(8542);
                                                            z = true;
                                                            continue;
                                                        case 122:
                                                            this.f3512f.mo1798a(9474);
                                                            z = true;
                                                            continue;
                                                        case 123:
                                                            this.f3512f.mo1798a(9488);
                                                            z = true;
                                                            continue;
                                                        case 124:
                                                            this.f3512f.mo1798a(9492);
                                                            z = true;
                                                            continue;
                                                        case 125:
                                                            this.f3512f.mo1798a(9472);
                                                            z = true;
                                                            continue;
                                                        case 126:
                                                            this.f3512f.mo1798a(9496);
                                                            z = true;
                                                            continue;
                                                        case 127:
                                                            this.f3512f.mo1798a(9484);
                                                            z = true;
                                                            continue;
                                                        default:
                                                            StringBuilder sb3 = new StringBuilder(33);
                                                            sb3.append("Invalid G2 character: ");
                                                            sb3.append(c4);
                                                            Log.w("Cea708Decoder", sb3.toString());
                                                            z = true;
                                                            continue;
                                                            continue;
                                                    }
                                            }
                                        } else {
                                            this.f3512f.mo1798a(8480);
                                            z = true;
                                        }
                                    } else if (c4 <= 159) {
                                        if (c4 <= 135) {
                                            this.f3509c.mo2054b(32);
                                        } else if (c4 > 143) {
                                            this.f3509c.mo2054b(2);
                                            this.f3509c.mo2054b(this.f3509c.mo2057c(i7) << i5);
                                        } else {
                                            this.f3509c.mo2054b(40);
                                        }
                                    } else if (c4 > 255) {
                                        StringBuilder sb4 = new StringBuilder(37);
                                        sb4.append("Invalid extended command: ");
                                        sb4.append(c4);
                                        Log.w("Cea708Decoder", sb4.toString());
                                    } else if (c4 != 160) {
                                        StringBuilder sb5 = new StringBuilder(33);
                                        sb5.append("Invalid G3 character: ");
                                        sb5.append(c4);
                                        Log.w("Cea708Decoder", sb5.toString());
                                        this.f3512f.mo1798a('_');
                                        z = true;
                                    } else {
                                        this.f3512f.mo1798a(13252);
                                        z = true;
                                    }
                                } else if (c4 > 7) {
                                    if (c4 <= 15) {
                                        this.f3509c.mo2054b(8);
                                    } else if (c4 > 23) {
                                        this.f3509c.mo2054b(24);
                                    } else {
                                        this.f3509c.mo2054b(16);
                                    }
                                }
                                i5 = 3;
                                i6 = 44;
                            } else {
                                if (c3 <= 31) {
                                    if (c3 != 0) {
                                        if (c3 == i5) {
                                            this.f3513g = m2960h();
                                        } else if (c3 != 8) {
                                            switch (c3) {
                                                case 12:
                                                    m2961i();
                                                    break;
                                                case 13:
                                                    this.f3512f.mo1798a(10);
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (c3 < 17 || c3 > 23) {
                                                        if (c3 < 24) {
                                                            StringBuilder sb6 = new StringBuilder(31);
                                                            sb6.append("Invalid C0 command: ");
                                                            sb6.append(c3);
                                                            Log.w("Cea708Decoder", sb6.toString());
                                                            break;
                                                        } else {
                                                            StringBuilder sb7 = new StringBuilder(54);
                                                            sb7.append("Currently unsupported COMMAND_P16 Command: ");
                                                            sb7.append(c3);
                                                            Log.w("Cea708Decoder", sb7.toString());
                                                            this.f3509c.mo2054b(16);
                                                            break;
                                                        }
                                                    } else {
                                                        StringBuilder sb8 = new StringBuilder(55);
                                                        sb8.append("Currently unsupported COMMAND_EXT1 Command: ");
                                                        sb8.append(c3);
                                                        Log.w("Cea708Decoder", sb8.toString());
                                                        this.f3509c.mo2054b(8);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            bdy bdy = this.f3512f;
                                            int length = bdy.f3484g.length();
                                            if (length > 0) {
                                                bdy.f3484g.delete(length - 1, length);
                                            }
                                        }
                                    }
                                } else if (c3 <= 127) {
                                    if (c3 != 127) {
                                        this.f3512f.mo1798a((char) (c3 & 255));
                                        i6 = 44;
                                        z = true;
                                    } else {
                                        this.f3512f.mo1798a(9835);
                                        i6 = 44;
                                        z = true;
                                    }
                                } else if (c3 <= 159) {
                                    switch (c3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i8 = c3 - 128;
                                            if (this.f3516j != i8) {
                                                this.f3516j = i8;
                                                this.f3512f = this.f3511e[i8];
                                                i5 = 3;
                                                i6 = 44;
                                                z = true;
                                                break;
                                            }
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 136:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (this.f3509c.mo2060e()) {
                                                    this.f3511e[8 - i9].mo1804c();
                                                }
                                            }
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 137:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (this.f3509c.mo2060e()) {
                                                    this.f3511e[8 - i10].f3486i = true;
                                                }
                                            }
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (this.f3509c.mo2060e()) {
                                                    this.f3511e[8 - i11].f3486i = false;
                                                }
                                            }
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (this.f3509c.mo2060e()) {
                                                    bdy bdy2 = this.f3511e[8 - i12];
                                                    bdy2.f3486i = !bdy2.f3486i;
                                                }
                                            }
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (this.f3509c.mo2060e()) {
                                                    this.f3511e[8 - i13].mo1802b();
                                                }
                                            }
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 141:
                                            this.f3509c.mo2054b(8);
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 142:
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 143:
                                            m2961i();
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 144:
                                            if (this.f3512f.f3485h) {
                                                this.f3509c.mo2057c(4);
                                                this.f3509c.mo2057c(2);
                                                this.f3509c.mo2057c(2);
                                                boolean e = this.f3509c.mo2060e();
                                                boolean e2 = this.f3509c.mo2060e();
                                                this.f3509c.mo2057c(3);
                                                this.f3509c.mo2057c(3);
                                                this.f3512f.mo1800a(e, e2);
                                                i5 = 3;
                                                i6 = 44;
                                                z = true;
                                                break;
                                            } else {
                                                this.f3509c.mo2054b(16);
                                                i5 = 3;
                                                i6 = 44;
                                                z = true;
                                                break;
                                            }
                                        case 145:
                                            if (this.f3512f.f3485h) {
                                                int a = bdy.m2949a(this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2));
                                                int a2 = bdy.m2949a(this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2));
                                                this.f3509c.mo2054b(2);
                                                bdy.m2950a(this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2));
                                                this.f3512f.mo1799a(a, a2);
                                                i5 = 3;
                                                i6 = 44;
                                                z = true;
                                                break;
                                            } else {
                                                this.f3509c.mo2054b(24);
                                                i5 = 3;
                                                i6 = 44;
                                                z = true;
                                                break;
                                            }
                                        case 146:
                                            if (this.f3512f.f3485h) {
                                                this.f3509c.mo2054b(4);
                                                int c5 = this.f3509c.mo2057c(4);
                                                this.f3509c.mo2054b(2);
                                                i7 = 6;
                                                this.f3509c.mo2057c(6);
                                                bdy bdy3 = this.f3512f;
                                                if (bdy3.f3498u != c5) {
                                                    bdy3.mo1798a(10);
                                                }
                                                bdy3.f3498u = c5;
                                                i5 = 3;
                                                i6 = 44;
                                                z = true;
                                                break;
                                            } else {
                                                this.f3509c.mo2054b(16);
                                                i5 = 3;
                                                i6 = 44;
                                                i7 = 6;
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
                                            sb9.append(c3);
                                            Log.w("Cea708Decoder", sb9.toString());
                                            i5 = 3;
                                            i6 = 44;
                                            z = true;
                                            break;
                                        case 151:
                                            if (!this.f3512f.f3485h) {
                                                this.f3509c.mo2054b(32);
                                                i5 = 3;
                                                i6 = 44;
                                                i7 = 6;
                                                z = true;
                                                break;
                                            } else {
                                                int a3 = bdy.m2949a(this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2));
                                                this.f3509c.mo2057c(2);
                                                bdy.m2950a(this.f3509c.mo2057c(2), this.f3509c.mo2057c(2), this.f3509c.mo2057c(2));
                                                this.f3509c.mo2060e();
                                                this.f3509c.mo2060e();
                                                this.f3509c.mo2057c(2);
                                                this.f3509c.mo2057c(2);
                                                int c6 = this.f3509c.mo2057c(2);
                                                this.f3509c.mo2054b(8);
                                                this.f3512f.mo1803b(a3, c6);
                                                i5 = 3;
                                                i6 = 44;
                                                i7 = 6;
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
                                            int i14 = c3 - 152;
                                            bdy bdy4 = this.f3511e[i14];
                                            this.f3509c.mo2054b(2);
                                            boolean e3 = this.f3509c.mo2060e();
                                            boolean e4 = this.f3509c.mo2060e();
                                            this.f3509c.mo2060e();
                                            int c7 = this.f3509c.mo2057c(i5);
                                            boolean e5 = this.f3509c.mo2060e();
                                            int c8 = this.f3509c.mo2057c(7);
                                            int c9 = this.f3509c.mo2057c(8);
                                            int c10 = this.f3509c.mo2057c(4);
                                            int c11 = this.f3509c.mo2057c(4);
                                            this.f3509c.mo2054b(2);
                                            this.f3509c.mo2057c(i7);
                                            this.f3509c.mo2054b(2);
                                            int c12 = this.f3509c.mo2057c(i5);
                                            int c13 = this.f3509c.mo2057c(i5);
                                            bdy4.f3485h = true;
                                            bdy4.f3486i = e3;
                                            bdy4.f3493p = e4;
                                            bdy4.f3487j = c7;
                                            bdy4.f3488k = e5;
                                            bdy4.f3489l = c8;
                                            bdy4.f3490m = c9;
                                            bdy4.f3491n = c10;
                                            int i15 = c11 + 1;
                                            if (bdy4.f3492o != i15) {
                                                bdy4.f3492o = i15;
                                                while (true) {
                                                    if (!e4 || bdy4.f3483f.size() < bdy4.f3492o) {
                                                        if (bdy4.f3483f.size() >= 15) {
                                                        }
                                                    }
                                                    bdy4.f3483f.remove(0);
                                                }
                                            }
                                            if (!(c12 == 0 || bdy4.f3495r == c12)) {
                                                bdy4.f3495r = c12;
                                                int i16 = c12 - 1;
                                                bdy4.mo1803b(bdy.f3478d[i16], bdy.f3477c[i16]);
                                            }
                                            if (!(c13 == 0 || bdy4.f3496s == c13)) {
                                                bdy4.f3496s = c13;
                                                int i17 = bdy.f3475a;
                                                bdy4.mo1800a(false, false);
                                                bdy4.mo1799a(bdy.f3475a, bdy.f3479e[c13 - 1]);
                                            }
                                            if (this.f3516j == i14) {
                                                i5 = 3;
                                                i6 = 44;
                                                i7 = 6;
                                                z = true;
                                                break;
                                            } else {
                                                this.f3516j = i14;
                                                this.f3512f = this.f3511e[i14];
                                                i5 = 3;
                                                i6 = 44;
                                                i7 = 6;
                                                z = true;
                                                break;
                                            }
                                    }
                                } else if (c3 > 255) {
                                    StringBuilder sb10 = new StringBuilder(33);
                                    sb10.append("Invalid base command: ");
                                    sb10.append(c3);
                                    Log.w("Cea708Decoder", sb10.toString());
                                } else {
                                    this.f3512f.mo1798a((char) (c3 & 255));
                                    i5 = 3;
                                    i6 = 44;
                                    z = true;
                                }
                                i5 = 3;
                                i6 = 44;
                            }
                            i5 = 3;
                            i6 = 44;
                        }
                        if (z) {
                            this.f3513g = m2960h();
                        }
                    }
                } else if (c != 0) {
                    StringBuilder sb11 = new StringBuilder(59);
                    sb11.append("serviceNumber is non-zero (");
                    sb11.append(c);
                    sb11.append(") when blockSize is 0");
                    Log.w("Cea708Decoder", sb11.toString());
                }
            }
            this.f3515i = null;
        }
    }

    /* renamed from: c */
    public final void mo1147c() {
        super.mo1147c();
        this.f3513g = null;
        this.f3514h = null;
        this.f3516j = 0;
        this.f3512f = this.f3511e[0];
        m2961i();
        this.f3515i = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m2960h() {
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
            bdy[] r4 = r0.f3511e
            r4 = r4[r3]
            boolean r4 = r4.mo1801a()
            if (r4 != 0) goto L_0x00e4
            bdy[] r4 = r0.f3511e
            r4 = r4[r3]
            boolean r5 = r4.f3486i
            if (r5 != 0) goto L_0x0021
            goto L_0x00e4
        L_0x0021:
            boolean r5 = r4.mo1801a()
            if (r5 != 0) goto L_0x00dc
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r5 = 0
        L_0x002d:
            java.util.List r6 = r4.f3483f
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0048
            java.util.List r6 = r4.f3483f
            java.lang.Object r6 = r6.get(r5)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7.append(r6)
            r6 = 10
            r7.append(r6)
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0048:
            android.text.SpannableString r5 = r4.mo1805d()
            r7.append(r5)
            int r5 = r4.f3494q
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
            boolean r9 = r4.f3488k
            if (r9 != 0) goto L_0x008f
            int r9 = r4.f3490m
            float r9 = (float) r9
            r10 = 1129381888(0x43510000, float:209.0)
            float r9 = r9 / r10
            int r10 = r4.f3489l
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r10 = r10 / r11
            goto L_0x009a
        L_0x008f:
            int r9 = r4.f3490m
            float r9 = (float) r9
            r10 = 1120272384(0x42c60000, float:99.0)
            float r9 = r9 / r10
            int r11 = r4.f3489l
            float r11 = (float) r11
            float r10 = r11 / r10
        L_0x009a:
            r11 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r11
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r13 = r9 + r12
            float r10 = r10 * r11
            float r9 = r10 + r12
            int r10 = r4.f3491n
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
            int r6 = r4.f3497t
            int r10 = p000.bdy.f3476b
            if (r6 == r10) goto L_0x00c8
            r14 = 1
            goto L_0x00ca
        L_0x00c8:
            r14 = 0
        L_0x00ca:
            bdx r16 = new bdx
            int r15 = r4.f3497t
            int r4 = r4.f3487j
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
        throw new UnsupportedOperationException("Method not decompiled: p000.bea.m2960h():java.util.List");
    }

    /* renamed from: i */
    private final void m2961i() {
        for (int i = 0; i < 8; i++) {
            this.f3511e[i].mo1802b();
        }
    }
}
