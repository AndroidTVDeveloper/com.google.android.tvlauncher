package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hl */
/* compiled from: PG */
final class C0203hl {

    /* renamed from: i */
    private static final RectF f9477i = new RectF();

    /* renamed from: j */
    private static final ConcurrentHashMap f9478j = new ConcurrentHashMap();

    /* renamed from: a */
    public int f9479a = 0;

    /* renamed from: b */
    public boolean f9480b = false;

    /* renamed from: c */
    public float f9481c = -1.0f;

    /* renamed from: d */
    public float f9482d = -1.0f;

    /* renamed from: e */
    public float f9483e = -1.0f;

    /* renamed from: f */
    public int[] f9484f = new int[0];

    /* renamed from: g */
    public boolean f9485g = false;

    /* renamed from: h */
    public final Context f9486h;

    /* renamed from: k */
    private TextPaint f9487k;

    /* renamed from: l */
    private final TextView f9488l;

    static {
        new ConcurrentHashMap();
    }

    public C0203hl(TextView textView) {
        this.f9488l = textView;
        this.f9486h = textView.getContext();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hl.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object
     arg types: [android.widget.TextView, java.lang.String, boolean]
     candidates:
      hl.a(float, float, float):void
      hl.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo5180f() {
        boolean z;
        int i;
        TextDirectionHeuristic textDirectionHeuristic;
        if (mo5181g()) {
            if (this.f9480b) {
                if (this.f9488l.getMeasuredHeight() > 0 && this.f9488l.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = this.f9488l.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) m7504a((Object) this.f9488l, "getHorizontallyScrolling", (Object) false)).booleanValue();
                    }
                    if (!z) {
                        i = (this.f9488l.getMeasuredWidth() - this.f9488l.getTotalPaddingLeft()) - this.f9488l.getTotalPaddingRight();
                    } else {
                        i = 1048576;
                    }
                    int height = (this.f9488l.getHeight() - this.f9488l.getCompoundPaddingBottom()) - this.f9488l.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f9477i) {
                            f9477i.setEmpty();
                            f9477i.right = (float) i;
                            f9477i.bottom = (float) height;
                            RectF rectF = f9477i;
                            int length = this.f9484f.length;
                            if (length != 0) {
                                int i2 = length - 1;
                                int i3 = 0;
                                int i4 = 1;
                                while (i4 <= i2) {
                                    int i5 = (i4 + i2) / 2;
                                    int i6 = this.f9484f[i5];
                                    CharSequence text = this.f9488l.getText();
                                    TransformationMethod transformationMethod = this.f9488l.getTransformationMethod();
                                    if (transformationMethod != null) {
                                        CharSequence transformation = transformationMethod.getTransformation(text, this.f9488l);
                                        if (transformation != null) {
                                            text = transformation;
                                        }
                                    }
                                    int i7 = Build.VERSION.SDK_INT;
                                    int maxLines = this.f9488l.getMaxLines();
                                    TextPaint textPaint = this.f9487k;
                                    if (textPaint == null) {
                                        this.f9487k = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.f9487k.set(this.f9488l.getPaint());
                                    this.f9487k.setTextSize((float) i6);
                                    int round = Math.round(rectF.right);
                                    int i8 = Build.VERSION.SDK_INT;
                                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f9487k, round);
                                    obtain.setAlignment((Layout.Alignment) m7504a(this.f9488l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.f9488l.getLineSpacingExtra(), this.f9488l.getLineSpacingMultiplier()).setIncludePad(this.f9488l.getIncludeFontPadding()).setBreakStrategy(this.f9488l.getBreakStrategy()).setHyphenationFrequency(this.f9488l.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                                    try {
                                        if (Build.VERSION.SDK_INT < 29) {
                                            textDirectionHeuristic = (TextDirectionHeuristic) m7504a(this.f9488l, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                                        } else {
                                            textDirectionHeuristic = this.f9488l.getTextDirectionHeuristic();
                                        }
                                        obtain.setTextDirection(textDirectionHeuristic);
                                    } catch (ClassCastException e) {
                                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                                    }
                                    StaticLayout build = obtain.build();
                                    if (maxLines != -1) {
                                        if (build.getLineCount() <= maxLines) {
                                            if (build.getLineEnd(build.getLineCount() - 1) != text.length()) {
                                            }
                                        }
                                        i3 = i5 - 1;
                                        i2 = i3;
                                    }
                                    if (((float) build.getHeight()) <= rectF.bottom) {
                                        int i9 = i4;
                                        i4 = i5 + 1;
                                        i3 = i9;
                                    }
                                    i3 = i5 - 1;
                                    i2 = i3;
                                }
                                float f = (float) this.f9484f[i3];
                                if (f != this.f9488l.getTextSize()) {
                                    mo5175a(0, f);
                                }
                            } else {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f9480b = true;
        }
    }

    /* renamed from: a */
    public static final int[] m7506a(int[] iArr) {
        if (r0 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0) {
                    Integer valueOf = Integer.valueOf(i);
                    if (Collections.binarySearch(arrayList, valueOf) < 0) {
                        arrayList.add(valueOf);
                    }
                }
            }
            if (r0 != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo5177c() {
        return Math.round(this.f9483e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo5176b() {
        return Math.round(this.f9482d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo5173a() {
        return Math.round(this.f9481c);
    }

    /* renamed from: a */
    private static Method m7505a(String str) {
        try {
            Method method = (Method) f9478j.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f9478j.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    private static Object m7504a(Object obj, String str, Object obj2) {
        try {
            obj2 = m7505a(str).invoke(obj, new Object[0]);
            if (obj2 != null) {
                return obj2;
            }
            return null;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo5181g() {
        return mo5182h() && this.f9479a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5175a(int i, float f) {
        Resources resources;
        Context context = this.f9486h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (applyDimension != this.f9488l.getPaint().getTextSize()) {
            this.f9488l.getPaint().setTextSize(applyDimension);
            int i2 = Build.VERSION.SDK_INT;
            boolean isInLayout = this.f9488l.isInLayout();
            if (this.f9488l.getLayout() != null) {
                this.f9480b = false;
                try {
                    Method a = m7505a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f9488l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.f9488l.forceLayout();
                } else {
                    this.f9488l.requestLayout();
                }
                this.f9488l.invalidate();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo5179e() {
        if (!mo5182h() || this.f9479a != 1) {
            this.f9480b = false;
            return false;
        }
        if (!this.f9485g || this.f9484f.length == 0) {
            int floor = ((int) Math.floor((double) ((this.f9483e - this.f9482d) / this.f9481c))) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round(this.f9482d + (((float) i) * this.f9481c));
            }
            this.f9484f = m7506a(iArr);
        }
        this.f9480b = true;
        return true;
    }

    /* renamed from: d */
    public final boolean mo5178d() {
        int[] iArr = this.f9484f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f9485g = z;
        if (z) {
            this.f9479a = 1;
            this.f9482d = (float) iArr[0];
            this.f9483e = (float) iArr[length - 1];
            this.f9481c = -1.0f;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo5182h() {
        return !(this.f9488l instanceof C0193hb);
    }

    /* renamed from: a */
    public final void mo5174a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f9479a = 1;
            this.f9482d = f;
            this.f9483e = f2;
            this.f9481c = f3;
            this.f9485g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}
