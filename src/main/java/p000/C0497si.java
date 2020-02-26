package p000;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: si */
/* compiled from: PG */
public final class C0497si implements ComponentCallbacks2 {

    /* renamed from: g */
    private static volatile C0497si f10360g;

    /* renamed from: h */
    private static volatile boolean f10361h;

    /* renamed from: a */
    public final C0630xg f10362a;

    /* renamed from: b */
    public final C0500sl f10363b;

    /* renamed from: c */
    public final C0507ss f10364c;

    /* renamed from: d */
    public final C0628xe f10365d;

    /* renamed from: e */
    public final afq f10366e;

    /* renamed from: f */
    public final List f10367f = new ArrayList();

    /* renamed from: i */
    private final C0660yj f10368i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ss.a(java.lang.Class, ua):void
     arg types: [java.lang.Class, ace]
     candidates:
      ss.a(java.lang.Class, tp):void
      ss.a(java.lang.Class, ua):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ss.a(java.lang.Class, ua):void
     arg types: [java.lang.Class, acd]
     candidates:
      ss.a(java.lang.Class, tp):void
      ss.a(java.lang.Class, ua):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ss.a(java.lang.Class, ua):void
     arg types: [java.lang.Class, aei]
     candidates:
      ss.a(java.lang.Class, tp):void
      ss.a(java.lang.Class, ua):void */
    private C0497si(Context context, C0602wf wfVar, C0660yj yjVar, C0630xg xgVar, C0628xe xeVar, afq afq, Map map, List list) {
        C0497si siVar;
        Context context2 = context;
        C0630xg xgVar2 = xgVar;
        C0628xe xeVar2 = xeVar;
        Class<byte[]> cls = byte[].class;
        this.f10362a = xgVar2;
        this.f10365d = xeVar2;
        this.f10368i = yjVar;
        this.f10366e = afq;
        Resources resources = context.getResources();
        C0507ss ssVar = new C0507ss();
        this.f10364c = ssVar;
        ssVar.mo5933a((C0533tr) new aco());
        if (Build.VERSION.SDK_INT >= 27) {
            this.f10364c.mo5933a((C0533tr) new adb());
        }
        List a = this.f10364c.mo5925a();
        aee aee = new aee(context2, a, xgVar2, xeVar2);
        adt adt = new adt(xgVar2, new ads());
        acx acx = new acx(this.f10364c.mo5925a(), resources.getDisplayMetrics(), xgVar2, xeVar2);
        ach ach = new ach(acx);
        adj adj = new adj(acx, xeVar2);
        aea aea = new aea(context2);
        aav aav = new aav(resources);
        aaw aaw = new aaw(resources);
        aau aau = new aau(resources);
        aat aat = new aat(resources);
        Class<byte[]> cls2 = cls;
        ace ace = new ace(xeVar2);
        aes aes = new aes();
        aev aev = new aev();
        ContentResolver contentResolver = context.getContentResolver();
        C0507ss ssVar2 = this.f10364c;
        aat aat2 = aat;
        ssVar2.mo5930a(ByteBuffer.class, new C0684zg());
        ssVar2.mo5930a(InputStream.class, new aay(xeVar2));
        ssVar2.mo5932a("Bitmap", ByteBuffer.class, Bitmap.class, ach);
        ssVar2.mo5932a("Bitmap", InputStream.class, Bitmap.class, adj);
        ssVar2.mo5932a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, adt);
        aau aau2 = aau;
        ssVar2.mo5932a("Bitmap", AssetFileDescriptor.class, Bitmap.class, new adt(xgVar2, new adq((byte) 0)));
        ssVar2.mo5927a(Bitmap.class, Bitmap.class, abd.f43a);
        ssVar2.mo5932a("Bitmap", Bitmap.class, Bitmap.class, new adn());
        ssVar2.mo5931a(Bitmap.class, (C0543ua) ace);
        ssVar2.mo5932a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new acc(resources, ach));
        ssVar2.mo5932a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new acc(resources, adj));
        ssVar2.mo5932a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new acc(resources, adt));
        ssVar2.mo5931a(BitmapDrawable.class, (C0543ua) new acd(xgVar2, ace));
        ssVar2.mo5932a("Gif", InputStream.class, aeh.class, new aer(a, aee, xeVar2));
        ssVar2.mo5932a("Gif", ByteBuffer.class, aeh.class, aee);
        ssVar2.mo5931a(aeh.class, (C0543ua) new aei());
        ssVar2.mo5927a(C0525tj.class, C0525tj.class, abd.f43a);
        ssVar2.mo5932a("Bitmap", C0525tj.class, Bitmap.class, new aep(xgVar2));
        ssVar2.mo5929a(Uri.class, Drawable.class, aea);
        ssVar2.mo5929a(Uri.class, Bitmap.class, new adh(aea, xgVar2));
        ssVar2.mo5934a((C0550uh) new adu());
        ssVar2.mo5927a(File.class, ByteBuffer.class, new C0686zi());
        ssVar2.mo5927a(File.class, InputStream.class, new C0693zp((byte) 0));
        ssVar2.mo5929a(File.class, File.class, new aec());
        ssVar2.mo5927a(File.class, ParcelFileDescriptor.class, new C0693zp());
        ssVar2.mo5927a(File.class, File.class, abd.f43a);
        ssVar2.mo5934a((C0550uh) new C0559uq(xeVar2));
        ssVar2.mo5927a(Integer.TYPE, InputStream.class, aav);
        aau aau3 = aau2;
        ssVar2.mo5927a(Integer.TYPE, ParcelFileDescriptor.class, aau3);
        ssVar2.mo5927a(Integer.class, InputStream.class, aav);
        ssVar2.mo5927a(Integer.class, ParcelFileDescriptor.class, aau3);
        aaw aaw2 = aaw;
        ssVar2.mo5927a(Integer.class, Uri.class, aaw2);
        aat aat3 = aat2;
        ssVar2.mo5927a(Integer.TYPE, AssetFileDescriptor.class, aat3);
        ssVar2.mo5927a(Integer.class, AssetFileDescriptor.class, aat3);
        ssVar2.mo5927a(Integer.TYPE, Uri.class, aaw2);
        ssVar2.mo5927a(String.class, InputStream.class, new C0691zn());
        ssVar2.mo5927a(Uri.class, InputStream.class, new C0691zn());
        ssVar2.mo5927a(String.class, InputStream.class, new abb());
        ssVar2.mo5927a(String.class, ParcelFileDescriptor.class, new aba());
        ssVar2.mo5927a(String.class, AssetFileDescriptor.class, new aaz());
        ssVar2.mo5927a(Uri.class, InputStream.class, new abp());
        ssVar2.mo5927a(Uri.class, InputStream.class, new C0674yx(context.getAssets()));
        ssVar2.mo5927a(Uri.class, ParcelFileDescriptor.class, new C0673yw(context.getAssets()));
        Context context3 = context;
        aes aes2 = aes;
        ssVar2.mo5927a(Uri.class, InputStream.class, new abr(context3));
        ssVar2.mo5927a(Uri.class, InputStream.class, new abt(context3));
        if (Build.VERSION.SDK_INT >= 29) {
            siVar = this;
            siVar.f10364c.mo5927a(Uri.class, InputStream.class, new abv(context3, (byte) 0));
            siVar.f10364c.mo5927a(Uri.class, ParcelFileDescriptor.class, new abv(context3));
        } else {
            siVar = this;
        }
        C0507ss ssVar3 = siVar.f10364c;
        ContentResolver contentResolver2 = contentResolver;
        ssVar3.mo5927a(Uri.class, InputStream.class, new abj(contentResolver2));
        ssVar3.mo5927a(Uri.class, ParcelFileDescriptor.class, new abh(contentResolver2));
        ssVar3.mo5927a(Uri.class, AssetFileDescriptor.class, new abg(contentResolver2));
        ssVar3.mo5927a(Uri.class, InputStream.class, new abl());
        ssVar3.mo5927a(URL.class, InputStream.class, new aby());
        ssVar3.mo5927a(Uri.class, File.class, new aab(context3));
        ssVar3.mo5927a(C0699zv.class, InputStream.class, new abn());
        Class<byte[]> cls3 = cls2;
        ssVar3.mo5927a(cls3, ByteBuffer.class, new C0678za());
        ssVar3.mo5927a(cls3, InputStream.class, new C0682ze());
        ssVar3.mo5927a(Uri.class, Uri.class, abd.f43a);
        ssVar3.mo5927a(Drawable.class, Drawable.class, abd.f43a);
        ssVar3.mo5929a(Drawable.class, Drawable.class, new aeb());
        ssVar3.mo5928a(Bitmap.class, BitmapDrawable.class, new aet(resources));
        ssVar3.mo5928a(Bitmap.class, cls3, aes2);
        aev aev2 = aev;
        ssVar3.mo5928a(Drawable.class, cls3, new aeu(xgVar2, aes2, aev2));
        ssVar3.mo5928a(aeh.class, cls3, aev2);
        siVar.f10363b = new C0500sl(context, xeVar, siVar.f10364c, map, list, wfVar);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    /* renamed from: b */
    public final void mo5920b() {
        aie.m559a();
        this.f10368i.mo6133a();
        this.f10362a.mo6107a();
        this.f10365d.mo6100a();
    }

    /* renamed from: a */
    public static C0497si m8291a(Context context) {
        if (f10360g == null) {
            GeneratedAppGlideModule d = m8297d(context.getApplicationContext());
            synchronized (C0497si.class) {
                if (f10360g == null) {
                    if (!f10361h) {
                        f10361h = true;
                        m8293a(context, new C0499sk(), d);
                        f10361h = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return f10360g;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m8297d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException e) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e2) {
            m8294a(e2);
            return null;
        } catch (IllegalAccessException e3) {
            m8294a(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            m8294a(e4);
            return null;
        } catch (InvocationTargetException e5) {
            m8294a(e5);
            return null;
        }
    }

    /* renamed from: a */
    public final Context mo5919a() {
        return this.f10363b.getBaseContext();
    }

    /* renamed from: b */
    public static afq m8295b(Context context) {
        aic.m543a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m8291a(context).f10366e;
    }

    /* renamed from: a */
    private static void m8293a(Context context, C0499sk skVar, GeneratedAppGlideModule generatedAppGlideModule) {
        int i;
        C0499sk skVar2 = skVar;
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (generatedAppGlideModule == null) {
            afy afy = new afy(applicationContext);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = afy.f252a.getPackageManager().getApplicationInfo(afy.f252a.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(afy.m319a(next));
                        }
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ((afw) arrayList.get(i3)).mo177a();
                }
                if (skVar2.f10374f == null) {
                    C0668yr yrVar = new C0668yr(false);
                    yrVar.mo6136a(C0671yu.m8687a());
                    yrVar.f10829a = "source";
                    skVar2.f10374f = yrVar.mo6135a();
                }
                if (skVar2.f10375g == null) {
                    C0668yr yrVar2 = new C0668yr(true);
                    yrVar2.mo6136a(1);
                    yrVar2.f10829a = "disk-cache";
                    skVar2.f10375g = yrVar2.mo6135a();
                }
                if (skVar2.f10379k == null) {
                    if (C0671yu.m8687a() >= 4) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    C0668yr yrVar3 = new C0668yr(true);
                    yrVar3.mo6136a(i);
                    yrVar3.f10829a = "animation";
                    skVar2.f10379k = yrVar3.mo6135a();
                }
                if (skVar2.f10377i == null) {
                    skVar2.f10377i = new C0664yn(new C0661yk(applicationContext));
                }
                if (skVar2.f10378j == null) {
                    skVar2.f10378j = new afh();
                }
                if (skVar2.f10371c == null) {
                    int i4 = skVar2.f10377i.f10822a;
                    if (i4 > 0) {
                        skVar2.f10371c = new C0639xp((long) i4);
                    } else {
                        skVar2.f10371c = new C0631xh();
                    }
                }
                if (skVar2.f10372d == null) {
                    skVar2.f10372d = new C0638xo(skVar2.f10377i.f10824c);
                }
                if (skVar2.f10373e == null) {
                    skVar2.f10373e = new C0658yh((long) skVar2.f10377i.f10823b);
                }
                if (skVar2.f10376h == null) {
                    skVar2.f10376h = new C0655ye(applicationContext);
                }
                if (skVar2.f10370b == null) {
                    skVar2.f10370b = new C0602wf(skVar2.f10373e, skVar2.f10376h, skVar2.f10375g, skVar2.f10374f, new C0671yu(new ThreadPoolExecutor(0, Integer.MAX_VALUE, C0671yu.f10837a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C0670yt("source-unlimited", false))), skVar2.f10379k);
                }
                List list = skVar2.f10380l;
                if (list != null) {
                    skVar2.f10380l = Collections.unmodifiableList(list);
                } else {
                    skVar2.f10380l = Collections.emptyList();
                }
                C0497si siVar = new C0497si(applicationContext, skVar2.f10370b, skVar2.f10373e, skVar2.f10371c, skVar2.f10372d, new afq(), skVar2.f10369a, skVar2.f10380l);
                int size2 = arrayList.size();
                while (i2 < size2) {
                    afw afw = (afw) arrayList.get(i2);
                    try {
                        afw.mo178a(applicationContext, siVar.f10364c);
                        i2++;
                    } catch (AbstractMethodError e) {
                        String valueOf = String.valueOf(afw.getClass().getName());
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ") : "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(valueOf), e);
                    }
                }
                applicationContext.registerComponentCallbacks(siVar);
                f10360g = siVar;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
            }
        } else {
            throw null;
        }
    }

    public final void onLowMemory() {
        mo5920b();
    }

    public final void onTrimMemory(int i) {
        aie.m559a();
        List list = this.f10367f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0512sx sxVar = (C0512sx) list.get(i2);
        }
        C0660yj yjVar = this.f10368i;
        if (i >= 40) {
            ((ahz) yjVar).mo293a();
        } else if (i >= 20 || i == 15) {
            ahz ahz = (ahz) yjVar;
            ahz.mo294a(ahz.mo295b() / 2);
        }
        this.f10362a.mo6108a(i);
        this.f10365d.mo6101a(i);
    }

    /* renamed from: a */
    private static void m8294a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: a */
    public static C0512sx m8292a(Activity activity) {
        return m8295b(activity).mo171a(activity);
    }

    /* renamed from: c */
    public static C0512sx m8296c(Context context) {
        return m8295b(context).mo172a(context);
    }
}
