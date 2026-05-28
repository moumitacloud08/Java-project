# ProgramPractise_01

------------GIT--------------

echo "# ProgramPractise_01" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/moumitacloud08/ProgramPractise_01.git
git push -u origin main
-----------------------

new Thread(deadlock:: worker1,"worker1").start();

new Thread(new Runnable() {
    @Override
    public void run() {
      deadlock.worker1();
    }
},"worker1").start();
