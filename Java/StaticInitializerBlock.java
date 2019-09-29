

static boolean flag;
static int B;
static int H;
static {
    flag = true;
    Scanner scanner = new Scanner(System.in);
    while(scanner.hasNext()) {
        B = scanner.nextInt();
        H = scanner.nextInt();
    }

    try{
        if(B <=0 || H <= 0) {
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    } catch(Exception e) {
        System.out.println(e);
    }

    
}

