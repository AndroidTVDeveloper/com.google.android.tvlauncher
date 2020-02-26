package p000;

/* renamed from: da */
/* compiled from: PG */
public class C0084da implements C0082cz {

    /* renamed from: a */
    private final Object[] f8011a;

    /* renamed from: b */
    private int f8012b;

    public C0084da(int i) {
        this.f8011a = new Object[i];
    }

    /* renamed from: a */
    public Object mo317a() {
        int i = this.f8012b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f8011a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f8012b = i2;
        return obj;
    }

    /* renamed from: a */
    public boolean mo318a(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.f8012b;
            if (i >= i2) {
                Object[] objArr = this.f8011a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f8012b = i2 + 1;
                return true;
            } else if (this.f8011a[i] != obj) {
                i++;
            } else {
                throw new IllegalStateException("Already in the pool!");
            }
        }
    }
}
