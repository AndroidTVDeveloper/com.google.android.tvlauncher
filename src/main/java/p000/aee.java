package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: aee */
/* compiled from: PG */
public final class aee implements C0541tz {

    /* renamed from: a */
    private static final aed f167a = new aed();

    /* renamed from: b */
    private final Context f168b;

    /* renamed from: c */
    private final List f169c;

    /* renamed from: d */
    private final aed f170d;

    /* renamed from: e */
    private final aef f171e;

    public aee(Context context, List list, C0630xg xgVar, C0628xe xeVar) {
        aed aed = f167a;
        this.f168b = context.getApplicationContext();
        this.f169c = list;
        this.f171e = new aef(xgVar, xeVar);
        this.f170d = aed;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0619ww mo38a(Object obj, int i, int i2, C0539tx txVar) {
        C0527tl tlVar;
        Bitmap.Config config;
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C0528tm a = this.f170d.mo90a(byteBuffer);
        try {
            ahy.m529a();
            if (a.f10494b != null) {
                aej aej = null;
                int i3 = 0;
                if (a.mo5983e()) {
                    tlVar = a.f10495c;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < 6; i4++) {
                        sb.append((char) a.mo5981c());
                    }
                    if (sb.toString().startsWith("GIF")) {
                        a.f10495c.f10485f = a.mo5982d();
                        a.f10495c.f10486g = a.mo5982d();
                        int c = a.mo5981c();
                        C0527tl tlVar2 = a.f10495c;
                        if ((c & 128) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        tlVar2.f10487h = z2;
                        tlVar2.f10488i = (int) Math.pow(2.0d, (double) ((c & 7) + 1));
                        a.f10495c.f10489j = a.mo5981c();
                        a.f10495c.f10490k = a.mo5981c();
                        if (a.f10495c.f10487h && !a.mo5983e()) {
                            C0527tl tlVar3 = a.f10495c;
                            tlVar3.f10480a = a.mo5979a(tlVar3.f10488i);
                            C0527tl tlVar4 = a.f10495c;
                            tlVar4.f10491l = tlVar4.f10480a[tlVar4.f10489j];
                        }
                    } else {
                        a.f10495c.f10481b = 1;
                    }
                    if (!a.mo5983e()) {
                        boolean z3 = false;
                        while (true) {
                            if (!z3) {
                                if (a.mo5983e()) {
                                    break;
                                }
                                int c2 = a.mo5981c();
                                if (c2 == 33) {
                                    int c3 = a.mo5981c();
                                    if (c3 == 1) {
                                        a.mo5978a();
                                    } else if (c3 == 249) {
                                        a.f10495c.f10483d = new C0526tk();
                                        a.mo5981c();
                                        int c4 = a.mo5981c();
                                        C0526tk tkVar = a.f10495c.f10483d;
                                        int i5 = (c4 & 28) >> 2;
                                        tkVar.f10475g = i5;
                                        if (i5 == 0) {
                                            tkVar.f10475g = 1;
                                        }
                                        tkVar.f10474f = (c4 & 1) != 0;
                                        int d = a.mo5982d();
                                        if (d < 2) {
                                            d = 10;
                                        }
                                        C0526tk tkVar2 = a.f10495c.f10483d;
                                        tkVar2.f10477i = d * 10;
                                        tkVar2.f10476h = a.mo5981c();
                                        a.mo5981c();
                                    } else if (c3 == 254) {
                                        a.mo5978a();
                                    } else if (c3 != 255) {
                                        a.mo5978a();
                                    } else {
                                        a.mo5980b();
                                        StringBuilder sb2 = new StringBuilder();
                                        for (int i6 = 0; i6 < 11; i6++) {
                                            sb2.append((char) a.f10493a[i6]);
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            while (true) {
                                                a.mo5980b();
                                                byte[] bArr = a.f10493a;
                                                if (bArr[0] == 1) {
                                                    a.f10495c.f10492m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                                }
                                                if (a.f10496d > 0) {
                                                    if (a.mo5983e()) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            a.mo5978a();
                                        }
                                    }
                                } else if (c2 == 44) {
                                    C0527tl tlVar5 = a.f10495c;
                                    if (tlVar5.f10483d == null) {
                                        tlVar5.f10483d = new C0526tk();
                                    }
                                    a.f10495c.f10483d.f10469a = a.mo5982d();
                                    a.f10495c.f10483d.f10470b = a.mo5982d();
                                    a.f10495c.f10483d.f10471c = a.mo5982d();
                                    a.f10495c.f10483d.f10472d = a.mo5982d();
                                    int c5 = a.mo5981c();
                                    int i7 = c5 & 128;
                                    int pow = (int) Math.pow(2.0d, (double) ((c5 & 7) + 1));
                                    C0526tk tkVar3 = a.f10495c.f10483d;
                                    if ((c5 & 64) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    tkVar3.f10473e = z;
                                    if (i7 != 0) {
                                        tkVar3.f10479k = a.mo5979a(pow);
                                    } else {
                                        tkVar3.f10479k = null;
                                    }
                                    a.f10495c.f10483d.f10478j = a.f10494b.position();
                                    a.mo5981c();
                                    a.mo5978a();
                                    if (!a.mo5983e()) {
                                        C0527tl tlVar6 = a.f10495c;
                                        tlVar6.f10482c++;
                                        tlVar6.f10484e.add(tlVar6.f10483d);
                                    }
                                } else if (c2 != 59) {
                                    a.f10495c.f10481b = 1;
                                } else {
                                    z3 = true;
                                }
                            } else {
                                break;
                            }
                        }
                        C0527tl tlVar7 = a.f10495c;
                        if (tlVar7.f10482c < 0) {
                            tlVar7.f10481b = 1;
                        }
                    }
                    tlVar = a.f10495c;
                }
                if (tlVar.f10482c > 0 && tlVar.f10481b == 0) {
                    if (txVar.mo5987a(aeq.f208a) != C0530to.f10518b) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    int min = Math.min(tlVar.f10486g / i2, tlVar.f10485f / i);
                    if (min != 0) {
                        i3 = Integer.highestOneBit(min);
                    }
                    C0529tn tnVar = new C0529tn(this.f171e, tlVar, byteBuffer, Math.max(1, i3));
                    if (config != Bitmap.Config.ARGB_8888) {
                        if (config != Bitmap.Config.RGB_565) {
                            String valueOf = String.valueOf(config);
                            String valueOf2 = String.valueOf(Bitmap.Config.ARGB_8888);
                            String valueOf3 = String.valueOf(Bitmap.Config.RGB_565);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                            sb3.append("Unsupported format: ");
                            sb3.append(valueOf);
                            sb3.append(", must be one of ");
                            sb3.append(valueOf2);
                            sb3.append(" or ");
                            sb3.append(valueOf3);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    }
                    tnVar.f10506j = config;
                    tnVar.mo5976a();
                    Bitmap b = tnVar.mo5977b();
                    if (b != null) {
                        aej = new aej(new aeh(this.f168b, tnVar, acb.f81b, i, i2, b));
                    }
                }
                this.f170d.mo91a(a);
                return aej;
            }
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } catch (Throwable th) {
            this.f170d.mo91a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo39a(Object obj, C0539tx txVar) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) txVar.mo5987a(aeq.f209b)).booleanValue()) {
            return false;
        }
        List list = this.f169c;
        if (byteBuffer != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                ImageHeaderParser$ImageType a = ((C0533tr) list.get(i)).mo54a(byteBuffer);
                if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                    imageHeaderParser$ImageType = a;
                    break;
                }
                i++;
            }
        }
        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
        if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }
}
