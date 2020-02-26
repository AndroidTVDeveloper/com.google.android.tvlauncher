package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aio */
/* compiled from: PG */
public class aio implements IInterface {

    /* renamed from: a */
    private final IBinder f405a;

    /* renamed from: b */
    private final String f406b;

    protected aio(IBinder iBinder, String str) {
        this.f405a = iBinder;
        this.f406b = str;
    }

    public final IBinder asBinder() {
        return this.f405a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo321a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f406b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo322a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f405a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo324b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f405a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo325c(int i, Parcel parcel) {
        try {
            this.f405a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
