package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: PG */
public class DatePicker extends pe {
    public static final int[] g = {5, 2, 1};
    public int a;
    public int b;
    public int c;
    public Calendar d;
    public Calendar e;
    public Calendar f;
    private String p;
    private pf q;
    private pf r;
    private pf s;
    private final DateFormat t;
    private pg u;
    private Calendar v;

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new SimpleDateFormat("MM/dd/yyyy");
        Locale locale = Locale.getDefault();
        getContext().getResources();
        pg a2 = ph.a(locale);
        this.u = a2;
        this.v = ph.a(this.v, a2.a);
        this.d = ph.a(this.d, this.u.a);
        this.e = ph.a(this.e, this.u.a);
        this.f = ph.a(this.f, this.u.a);
        pf pfVar = this.q;
        if (pfVar != null) {
            pfVar.d = this.u.b;
            a(this.a, pfVar);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.d);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, ly.d, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            String string = obtainStyledAttributes.getString(0);
            String string2 = obtainStyledAttributes.getString(1);
            String string3 = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            this.v.clear();
            if (TextUtils.isEmpty(string)) {
                this.v.set(1900, 0, 1);
            } else if (!a(string, this.v)) {
                this.v.set(1900, 0, 1);
            }
            this.d.setTimeInMillis(this.v.getTimeInMillis());
            this.v.clear();
            if (TextUtils.isEmpty(string2)) {
                this.v.set(2100, 0, 1);
            } else if (!a(string2, this.v)) {
                this.v.set(2100, 0, 1);
            }
            this.e.setTimeInMillis(this.v.getTimeInMillis());
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3;
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(getContext())) : string3;
            if (!TextUtils.equals(this.p, string3)) {
                this.p = string3;
                String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(this.u.a, string3);
                bestDateTimePattern = TextUtils.isEmpty(bestDateTimePattern) ? "MM/dd/yyyy" : bestDateTimePattern;
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
                boolean z = false;
                char c2 = 0;
                for (int i2 = 0; i2 < bestDateTimePattern.length(); i2++) {
                    char charAt = bestDateTimePattern.charAt(i2);
                    if (charAt != ' ') {
                        if (charAt != '\'') {
                            if (z) {
                                sb.append(charAt);
                            } else {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 6) {
                                        sb.append(charAt);
                                        break;
                                    } else if (charAt != cArr[i3]) {
                                        i3++;
                                    } else if (charAt != c2) {
                                        arrayList.add(sb.toString());
                                        sb.setLength(0);
                                    }
                                }
                            }
                            c2 = charAt;
                        } else if (z) {
                            z = false;
                        } else {
                            sb.setLength(0);
                            z = true;
                        }
                    }
                }
                arrayList.add(sb.toString());
                if (arrayList.size() == string3.length() + 1) {
                    this.l.clear();
                    this.l.addAll(arrayList);
                    this.r = null;
                    this.q = null;
                    this.s = null;
                    this.a = -1;
                    this.b = -1;
                    this.c = -1;
                    String upperCase = string3.toUpperCase();
                    ArrayList arrayList2 = new ArrayList(3);
                    for (int i4 = 0; i4 < upperCase.length(); i4++) {
                        char charAt2 = upperCase.charAt(i4);
                        if (charAt2 != 'D') {
                            if (charAt2 != 'M') {
                                if (charAt2 != 'Y') {
                                    throw new IllegalArgumentException("datePicker format error");
                                } else if (this.s == null) {
                                    pf pfVar2 = new pf();
                                    this.s = pfVar2;
                                    arrayList2.add(pfVar2);
                                    this.c = i4;
                                    this.s.e = "%d";
                                } else {
                                    throw new IllegalArgumentException("datePicker format error");
                                }
                            } else if (this.q == null) {
                                pf pfVar3 = new pf();
                                this.q = pfVar3;
                                arrayList2.add(pfVar3);
                                this.q.d = this.u.b;
                                this.a = i4;
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else if (this.r == null) {
                            pf pfVar4 = new pf();
                            this.r = pfVar4;
                            arrayList2.add(pfVar4);
                            this.r.e = "%02d";
                            this.b = i4;
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    }
                    if (this.l.size() != 0) {
                        if (this.l.size() == 1) {
                            CharSequence charSequence = (CharSequence) this.l.get(0);
                            this.l.clear();
                            this.l.add("");
                            for (int i5 = 0; i5 < arrayList2.size() - 1; i5++) {
                                this.l.add(charSequence);
                            }
                            this.l.add("");
                        } else if (this.l.size() != arrayList2.size() + 1) {
                            throw new IllegalStateException("Separators size: " + this.l.size() + " mustequal the size of columns: " + arrayList2.size() + " + 1");
                        }
                        this.i.clear();
                        this.h.removeAllViews();
                        this.j = new ArrayList(arrayList2);
                        if (this.k > this.j.size() - 1) {
                            this.k = this.j.size() - 1;
                        }
                        LayoutInflater from = LayoutInflater.from(getContext());
                        int a3 = a();
                        if (!TextUtils.isEmpty((CharSequence) this.l.get(0))) {
                            TextView textView = (TextView) from.inflate((int) R.layout.lb_picker_separator, this.h, false);
                            textView.setText((CharSequence) this.l.get(0));
                            this.h.addView(textView);
                        }
                        int i6 = 0;
                        while (i6 < a3) {
                            VerticalGridView verticalGridView = (VerticalGridView) from.inflate((int) R.layout.lb_picker_column, this.h, false);
                            a(verticalGridView);
                            verticalGridView.g(0);
                            verticalGridView.n = false;
                            verticalGridView.setFocusable(isActivated());
                            verticalGridView.a(0);
                            this.i.add(verticalGridView);
                            this.h.addView(verticalGridView);
                            int i7 = i6 + 1;
                            if (!TextUtils.isEmpty((CharSequence) this.l.get(i7))) {
                                TextView textView2 = (TextView) from.inflate((int) R.layout.lb_picker_separator, this.h, false);
                                textView2.setText((CharSequence) this.l.get(i7));
                                this.h.addView(textView2);
                            }
                            verticalGridView.a(new pc(this, this.m, this.n, i6));
                            boc boc = this.o;
                            nt ntVar = verticalGridView.L;
                            if (boc != null) {
                                ArrayList arrayList3 = ntVar.q;
                                if (arrayList3 == null) {
                                    ntVar.q = new ArrayList();
                                } else {
                                    arrayList3.clear();
                                }
                                ntVar.q.add(boc);
                            } else {
                                ntVar.q = null;
                            }
                            i6 = i7;
                        }
                        b();
                        return;
                    }
                    throw new IllegalStateException("Separators size is: " + this.l.size() + ". At least one separator must be provided");
                }
                throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + string3.length() + " + 1");
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(int i, int i2) {
        this.v.setTimeInMillis(this.f.getTimeInMillis());
        int i3 = a(i).a;
        if (i == this.b) {
            this.v.add(5, i2 - i3);
        } else if (i == this.a) {
            this.v.add(2, i2 - i3);
        } else if (i == this.c) {
            this.v.add(1, i2 - i3);
        } else {
            throw new IllegalArgumentException();
        }
        int i4 = this.v.get(1);
        int i5 = this.v.get(2);
        int i6 = this.v.get(5);
        if (this.f.get(1) != i4 || this.f.get(2) != i6 || this.f.get(5) != i5) {
            this.f.set(i4, i5, i6);
            if (this.f.before(this.d)) {
                this.f.setTimeInMillis(this.d.getTimeInMillis());
            } else if (this.f.after(this.e)) {
                this.f.setTimeInMillis(this.e.getTimeInMillis());
            }
            b();
        }
    }

    private final boolean a(String str, Calendar calendar) {
        try {
            calendar.setTime(this.t.parse(str));
            return true;
        } catch (ParseException e2) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    public static boolean b(pf pfVar, int i) {
        if (i == pfVar.c) {
            return false;
        }
        pfVar.c = i;
        return true;
    }

    public static boolean a(pf pfVar, int i) {
        if (i == pfVar.b) {
            return false;
        }
        pfVar.b = i;
        return true;
    }

    private final void b() {
        post(new pa(this));
    }
}
