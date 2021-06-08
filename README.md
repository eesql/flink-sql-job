# Flink SQL Dev and Submit

## Jar submit method
1. Develop streaming or table api task under tasks folder
2. use maven package jar, then submit to streaming platform.

## Sql submit via command line method

1. Set Flink and related install path in `env.sh`
2. Add SQL scripts under `src/main/resources/` with `.sql` suffix, e.g, `q1.sql`
3. Run your SQL via `./run.sh <sql-file-name>`, e.g. `./run.sh q1`
4. If the terminal returns the following output, it means the job is submitted successfully.

```
Starting execution of program
Job has been submitted with JobID d01b04d7c8f8a90798d6400462718743
```
