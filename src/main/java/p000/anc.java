package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: anc */
/* compiled from: PG */
public final class anc implements alu {

    /* renamed from: b */
    public int f901b = -1;

    /* renamed from: c */
    public float f902c = 1.0f;

    /* renamed from: d */
    public float f903d = 1.0f;

    /* renamed from: e */
    public int f904e = -1;

    /* renamed from: f */
    public boolean f905f;

    /* renamed from: g */
    public long f906g;

    /* renamed from: h */
    public long f907h;

    /* renamed from: i */
    private int f908i = -1;

    /* renamed from: j */
    private int f909j;

    /* renamed from: k */
    private anb f910k;

    /* renamed from: l */
    private ByteBuffer f911l;

    /* renamed from: m */
    private ShortBuffer f912m;

    /* renamed from: n */
    private ByteBuffer f913n;

    /* renamed from: o */
    private boolean f914o;

    public anc() {
        ByteBuffer byteBuffer = f724a;
        this.f911l = byteBuffer;
        this.f912m = byteBuffer.asShortBuffer();
        this.f913n = f724a;
        this.f909j = -1;
    }

    /* renamed from: b */
    public final int mo614b() {
        return this.f908i;
    }

    /* renamed from: c */
    public final int mo615c() {
        return 2;
    }

    /* renamed from: d */
    public final int mo616d() {
        return this.f904e;
    }

    /* renamed from: a */
    public final boolean mo613a(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.f909j;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.f901b == i && this.f908i == i2 && this.f904e == i4) {
                return false;
            }
            this.f901b = i;
            this.f908i = i2;
            this.f904e = i4;
            this.f905f = true;
            return true;
        }
        throw new alt(i, i2, i3);
    }

    /* renamed from: h */
    public final void mo620h() {
        if (mo612a()) {
            if (this.f905f) {
                this.f910k = new anb(this.f901b, this.f908i, this.f902c, this.f903d, this.f904e);
            } else {
                anb anb = this.f910k;
                if (anb != null) {
                    anb.f885g = 0;
                    anb.f887i = 0;
                    anb.f888j = 0;
                    anb.f889k = 0;
                    anb.f890l = 0;
                    anb.f891m = 0;
                    anb.f892n = 0;
                    anb.f893o = 0;
                    anb.f894p = 0;
                    anb.f895q = 0;
                }
            }
        }
        this.f913n = f724a;
        this.f906g = 0;
        this.f907h = 0;
        this.f914o = false;
    }

    /* renamed from: f */
    public final ByteBuffer mo618f() {
        ByteBuffer byteBuffer = this.f913n;
        this.f913n = f724a;
        return byteBuffer;
    }

    /* renamed from: a */
    public final boolean mo612a() {
        if (this.f901b != -1) {
            return Math.abs(this.f902c + -1.0f) >= 0.01f || Math.abs(this.f903d + -1.0f) >= 0.01f || this.f904e != this.f901b;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo619g() {
        if (!this.f914o) {
            return false;
        }
        anb anb = this.f910k;
        return anb == null || anb.mo685a() == 0;
    }

    /* renamed from: e */
    public final void mo617e() {
        int i;
        anb anb = this.f910k;
        if (anb != null) {
            int i2 = anb.f885g;
            float f = anb.f880b;
            float f2 = anb.f881c;
            int i3 = anb.f887i + ((int) ((((((float) i2) / (f / f2)) + ((float) anb.f888j)) / (anb.f882d * f2)) + 0.5f));
            short[] sArr = anb.f884f;
            int i4 = anb.f883e;
            anb.f884f = anb.mo686a(sArr, i2, i4 + i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = anb.f883e;
                i = i6 + i6;
                int i7 = anb.f879a;
                if (i5 >= i * i7) {
                    break;
                }
                anb.f884f[(i7 * i2) + i5] = 0;
                i5++;
            }
            anb.f885g += i;
            anb.mo687b();
            if (anb.f887i > i3) {
                anb.f887i = i3;
            }
            anb.f885g = 0;
            anb.f891m = 0;
            anb.f888j = 0;
        }
        this.f914o = true;
    }

    /* renamed from: a */
    public final void mo611a(ByteBuffer byteBuffer) {
        anb anb = (anb) bks.m3507a(this.f910k);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f906g += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = anb.f879a;
            int i2 = remaining2 / i;
            int i3 = i * i2;
            anb.f884f = anb.mo686a(anb.f884f, anb.f885g, i2);
            asShortBuffer.get(anb.f884f, anb.f885g * anb.f879a, (i3 + i3) / 2);
            anb.f885g += i2;
            anb.mo687b();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = anb.mo685a();
        if (a > 0) {
            if (this.f911l.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.f911l = order;
                this.f912m = order.asShortBuffer();
            } else {
                this.f911l.clear();
                this.f912m.clear();
            }
            ShortBuffer shortBuffer = this.f912m;
            int min = Math.min(shortBuffer.remaining() / anb.f879a, anb.f887i);
            shortBuffer.put(anb.f886h, 0, anb.f879a * min);
            int i4 = anb.f887i - min;
            anb.f887i = i4;
            short[] sArr = anb.f886h;
            int i5 = anb.f879a;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.f907h += (long) a;
            this.f911l.limit(a);
            this.f913n = this.f911l;
        }
    }

    /* renamed from: i */
    public final void mo621i() {
        this.f902c = 1.0f;
        this.f903d = 1.0f;
        this.f908i = -1;
        this.f901b = -1;
        this.f904e = -1;
        ByteBuffer byteBuffer = f724a;
        this.f911l = byteBuffer;
        this.f912m = byteBuffer.asShortBuffer();
        this.f913n = f724a;
        this.f909j = -1;
        this.f905f = false;
        this.f910k = null;
        this.f906g = 0;
        this.f907h = 0;
        this.f914o = false;
    }
}
